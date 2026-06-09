package com.plot.api.service;
import com.plot.api.model.Leitura;
import com.plot.api.repository.LeituraRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
@Service

public class LeituraService {
    private final LeituraRepository repository;

    public LeituraService(LeituraRepository repository) {
        this.repository = repository;
    }

    public Leitura iniciarNovaLeitura(Leitura leitura) {
        return repository.salvar(leitura);
    }

    public List<Leitura> listarTodas() {
        return repository.buscarTodos();
    }

    public Leitura registrarProgresso(Long id, int novaPaginaAtual) {
        Leitura leitura = repository.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Registro de leitura não encontrado."));

        if (novaPaginaAtual <= leitura.getPaginaAtual() || novaPaginaAtual > leitura.getTotalPaginas()) {
            throw new IllegalArgumentException("Progresso de página inválido.");
        }

        int paginasLidasHoje = novaPaginaAtual - leitura.getPaginaAtual();
        leitura.setPaginaAtual(novaPaginaAtual);

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        if (leitura.getDataUltimoCheckIn() == null) {
            leitura.setStreakAtual(1);
            leitura.setTotalXp(leitura.getTotalXp() + 50);
        } else if (leitura.getDataUltimoCheckIn().equals(ontem)) {
            leitura.setStreakAtual(leitura.getStreakAtual() + 1);
            int bonusMult = leitura.getStreakAtual() * 10;
            leitura.setTotalXp(leitura.getTotalXp() + 50 + bonusMult);
        } else if (!leitura.getDataUltimoCheckIn().equals(hoje)) {
            leitura.setStreakAtual(1);
            leitura.setTotalXp(leitura.getTotalXp() + 50);
        }

        if (paginasLidasHoje >= leitura.getMetaDiariaPaginas()) {
            leitura.setTotalXp(leitura.getTotalXp() + 25);
        }

        if (leitura.getStreakAtual() > leitura.getMaiorStreak()) {
            leitura.setMaiorStreak(leitura.getStreakAtual());
        }
        leitura.setDataUltimoCheckIn(hoje);

        return repository.salvar(leitura);
    }
}

package com.plot.api.repository;
import com.plot.api.model.Leitura;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Repository
public class LeituraRepository {
    private final HashMap<Long, Leitura> bancoDeDados = new HashMap<>();
    private Long idSequencial = 1L;

    public Leitura salvar(Leitura leitura) {
        if (leitura.getId() == null) {
            leitura.setId(idSequencial);
            idSequencial++;
        }
        bancoDeDados.put(leitura.getId(), leitura);
        return leitura;
    }

    public Optional<Leitura> buscarPorId(Long id) {
        return Optional.ofNullable(bancoDeDados.get(id));
    }

    public List<Leitura> buscarTodos() {
        return new ArrayList<>(bancoDeDados.values());
    }

    public void deletar(Long id) {
        bancoDeDados.remove(id);
    }
}

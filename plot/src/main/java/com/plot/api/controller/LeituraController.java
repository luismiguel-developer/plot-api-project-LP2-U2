package com.plot.api.controller;
import com.plot.api.model.Leitura;
import com.plot.api.service.LeituraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/leituras")
public class LeituraController {
    private final LeituraService service;
    
    public LeituraController(LeituraService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Leitura> criar(@RequestBody Leitura leitura) {
        Leitura novaLeitura = service.iniciarNovaLeitura(leitura);
        return ResponseEntity.ok(novaLeitura);
    }
    @GetMapping
    public ResponseEntity<List<Leitura>> listar() {
        List<Leitura> leituras = service.listarTodas();
        return ResponseEntity.ok(leituras);
    }
    @PostMapping("/{id}/checkin")
    public ResponseEntity<Leitura> efetuarCheckIn(@PathVariable Long id, @RequestParam int novaPaginaAtual) {
        Leitura leituraAtualizada = service.registrarProgresso(id, novaPaginaAtual);
        return ResponseEntity.ok(leituraAtualizada);
    }
}

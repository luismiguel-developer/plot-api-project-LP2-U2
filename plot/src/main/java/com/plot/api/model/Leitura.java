package com.plot.api.model;
import java.time.LocalDate;

public class Leitura {
    private Long id;
    private String tituloLivro;
    private int totalPaginas;
    private int paginaAtual;
    private int metaDiariaPaginas;
    private int streakAtual;
    private int maiorStreak;
    private int totalXp;
    private LocalDate dataUltimoCheckIn;

    public Leitura(Long id, String tituloLivro, int totalPaginas, int metaDiariaPaginas) {
        this.id = id;
        this.tituloLivro = tituloLivro;
        this.totalPaginas = totalPaginas;
        this.metaDiariaPaginas = metaDiariaPaginas;
        this.paginaAtual = 0;
        this.streakAtual = 0;
        this.maiorStreak = 0;
        this.totalXp = 0;
        this.dataUltimoCheckIn = null;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTituloLivro() { return tituloLivro; }
    public void setTituloLivro(String tituloLivro) { this.tituloLivro = tituloLivro; }

    public int getTotalPaginas() { return totalPaginas; }
    public void setTotalPaginas(int totalPaginas) { this.totalPaginas = totalPaginas; }

    public int getPaginaAtual() { return paginaAtual; }
    public void setPaginaAtual(int paginaAtual) { this.paginaAtual = paginaAtual; }

    public int getMetaDiariaPaginas() { return metaDiariaPaginas; }
    public void setMetaDiariaPaginas(int metaDiariaPaginas) { this.metaDiariaPaginas = metaDiariaPaginas; }

    public int getStreakAtual() { return streakAtual; }
    public void setStreakAtual(int streakAtual) { this.streakAtual = streakAtual; }

    public int getMaiorStreak() { return maiorStreak; }
    public void setMaiorStreak(int maiorStreak) { this.maiorStreak = maiorStreak; }

    public int getTotalXp() { return totalXp; }
    public void setTotalXp(int totalXp) { this.totalXp = totalXp; }

    public LocalDate getDataUltimoCheckIn() { return dataUltimoCheckIn; }
    public void setDataUltimoCheckIn(LocalDate dataUltimoCheckIn) { this.dataUltimoCheckIn = dataUltimoCheckIn; }
}

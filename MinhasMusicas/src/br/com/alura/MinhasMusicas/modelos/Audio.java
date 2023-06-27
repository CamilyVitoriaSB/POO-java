package br.com.alura.MinhasMusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }

}

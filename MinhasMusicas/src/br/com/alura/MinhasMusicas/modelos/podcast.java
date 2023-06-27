package br.com.alura.MinhasMusicas.modelos;

public class podcast extends Audio{
    private String apresentador;
    private String descricao;
    private String titulo;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}

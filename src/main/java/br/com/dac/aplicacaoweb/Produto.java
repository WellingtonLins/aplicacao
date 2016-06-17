package br.com.dac.aplicacaoweb;

/**
 *
 * @author Wellington
 */
public class Produto {
    private int id;
    private String descricao;

    public Produto() {
   
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
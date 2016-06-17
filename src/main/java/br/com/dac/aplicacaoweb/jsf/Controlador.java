package br.com.dac.aplicacaoweb.jsf;

import br.com.dac.aplicacaoweb.Produto;
import br.com.dac.aplicacaoweb.Produtos;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Wellington
 */
@Named
@RequestScoped
public class Controlador  implements Serializable{
    
    @EJB 
    private Produtos service;
    private Produto  produto =  new Produto();
 
    
    public String redirecionar(){
        
        return "home.xhtml";
    }
    public String salvar(){
        service.salvar(produto);
        return "home.xhtml";
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
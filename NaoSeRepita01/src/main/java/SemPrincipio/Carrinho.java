/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SemPrincipio;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Carrinho {
    private final String codigo;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Carrinho(String codigo) {
        this.codigo = codigo;
    }
    
    //methods
    
    public void adicionarBrinquedo(Produto produto) {
        Produto p1 = new Produto(produto.getNome(), produto.getValor(), "Brinquedo");
        this.produtos.add(p1);
    }
    
    public void adicionarRoupa(Produto produto) {
        Produto p1 = new Produto(produto.getNome(), produto.getValor(), "Roupa");
        this.produtos.add(p1);
    }
    
    //getters and setters
    
    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}

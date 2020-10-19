/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPrincipio;

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
    
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    //getters and setters
    
    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Produto> getMaterialEscolar() {
        return produtos;
    }
}

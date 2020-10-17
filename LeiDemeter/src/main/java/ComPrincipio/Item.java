/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPrincipio;

/**
 *
 * @author eduar
 */
public class Item {
    
    private Produto produto;
    private double quantidade;

    public Item(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //methods
    public double valorTotal(){
        double total = 0;
        total = (this.produto.getValor()*this.quantidade);
        return total;
    }
    
    //getter and setter
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}

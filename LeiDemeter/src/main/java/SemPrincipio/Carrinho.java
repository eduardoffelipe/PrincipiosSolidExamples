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
    
    private String comprador;
    private ArrayList<Item> itens = new ArrayList<>();

    public Carrinho(String comprador) {
        this.comprador = comprador;
    }

    //methods
    public double valorTotaldosItems(){
        double total = 0;
        
        for(Item item : itens){
            total += item.getProduto().getValor() * item.getQuantidade();
        }
        return total;
    }
    
    //getter and setter
    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }


    
    
}

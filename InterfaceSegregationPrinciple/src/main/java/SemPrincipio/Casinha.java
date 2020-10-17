/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SemPrincipio;

/**
 *
 * @author eduar
 */
public class Casinha implements Brinquedo {
    
    private double preco;
    private String cor;
    
    @Override
    public void preco(double price) {
      this.preco = price;
    }

    @Override
    public void cor(String color) {
        this.cor = color;
    }

    @Override
    public void movimentar() {
    } // casa nao movimenta

    @Override
    public void voar() {
    } // casa nao voa 
    
}

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
public class Aviaozinho implements Brinquedo,Voador,Movel {

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
        //funcao movimentar aqui!
    }

    @Override
    public void voar() {
        //funcao voar aqui!
    }
    
}

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
public class Botao {
    private Lampada lampada;

    
    public void Acionar(){
        lampada.ligar();

    }
    public void Desacionar(){
        lampada.desligar();
    }
}

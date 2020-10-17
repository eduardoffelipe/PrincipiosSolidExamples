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
public class Botao {
    
    private Dispositivo dispositivo;
            
    public void Acionar(){
        dispositivo.ligar();
    }
        
    public void Desacionar(){
        dispositivo.desligar();
    }
}

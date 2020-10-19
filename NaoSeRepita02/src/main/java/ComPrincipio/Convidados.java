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
public class Convidados {
    private ArrayList<Pessoa> convidados = new ArrayList<>();


    //methods
    
    public void adicionarConvidado(Pessoa pessoa) {
        this.convidados.add(pessoa);
    }
        
    //getters and setters
    
    public ArrayList<Pessoa> getConvidados() {
        return convidados;
    }
    
}

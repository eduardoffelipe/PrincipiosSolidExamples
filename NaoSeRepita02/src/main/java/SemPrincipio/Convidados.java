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
public class Convidados {
    private ArrayList<Pessoa> convidados = new ArrayList<>();


    //methods
    
    public void adicionarConvidadoHomem(Pessoa pessoa) {
        Pessoa p1 = new Pessoa(pessoa.getNome(), pessoa.getSobrenome(), "Masculino");
        this.convidados.add(p1);
    }
    
    public void adicionarConvidadoMulher(Pessoa pessoa) {
        Pessoa p1 = new Pessoa(pessoa.getNome(), pessoa.getSobrenome(), "Feminino");
        this.convidados.add(p1);
    }
        
    //getters and setters
    
    public ArrayList<Pessoa> getConvidados() {
        return convidados;
    }
    
}

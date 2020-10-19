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
public class Pessoa {
    protected String nome;
    protected String cpf;


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }
    
    //methods
    
    public void viver(){
        //viver
    }
            
    //getters and setters
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}

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
public class Gerente {
    
    private String nome;
    private String cargo;

    public Gerente(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}

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
public class Cliente extends Pessoa {
    private String codigo;

    public Cliente(String codigo, String nome, String cpf) {
        super(nome, cpf);
        this.codigo = codigo;
    }
    
    //methods
    
    public void comprar(){
        //comprar
    }
    
    //getters and setters

    public String getCodigo() {
        return codigo;
    }
    
    
    
}

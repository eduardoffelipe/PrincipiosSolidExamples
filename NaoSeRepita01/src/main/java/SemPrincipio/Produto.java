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
public class Produto {
    private final String nome;
    private final double valor;
    private final String tipo;
    
    public Produto(String nome, double valor, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    //getters and setters
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    } 

    public String getTipo() {
        return tipo;
    }
}

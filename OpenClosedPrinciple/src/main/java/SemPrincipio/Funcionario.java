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
public class Funcionario {
    private String nome;
    private double salarioBase;
    private String tipo;

    public Funcionario(String nome, double salarioBase, String tipo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tipo = tipo;
    }
    

    //getters and setters

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

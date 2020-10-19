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
public class Gerente extends Pessoa {
    private double salario;
    private double faltas;
    
    public Gerente(String nome, String cpf ) {
        super(nome, cpf );
        this.salario = salario;
        this.faltas = faltas;
    }
    
    //methods
    
    public void gerenciar(){
        //gerenciar
    }
    
    //getters and setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getFaltas() {
        return faltas;
    }

    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }    
    
}

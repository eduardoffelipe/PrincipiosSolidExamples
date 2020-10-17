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
public class CalcularSalario {
    
    
    
    public double calcularSalarioBonus(Funcionario funcionario){
        double salario;
        if(funcionario.getTipo().equals("Gerente")){
            
        salario = funcionario.getSalarioBase()+ (funcionario.getSalarioBase()*0.5);
            return salario;
        }
        if(funcionario.getTipo().equals("Analista")){
            
            salario = funcionario.getSalarioBase()+ (funcionario.getSalarioBase()*0.3);
            return salario;
        }
        return funcionario.getSalarioBase();
    }
}

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
public class CalculaSalarioAnalista extends CalcularSalario {


    //methods         
    @Override
    public double calcularSalarioBonus(Funcionario funcionario) {
        double salario;
        salario = funcionario.getSalarioBase()+ (funcionario.getSalarioBase()*0.3);
        return salario;
    }
}

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
public class Equipe {
    
    
    private String nome;
    private Gerente gerente;
    private ArrayList <Funcionario> funcionarios;

    public Equipe(String nome, Gerente gerente) {
        this.funcionarios = new ArrayList();
        this.nome = nome;
        this.gerente = gerente;
    }
    
    //methods  
    public void addFuncionarioEquipe(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    //getters and setters
    public String getNome() {
        return nome;
    }


    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }    
}

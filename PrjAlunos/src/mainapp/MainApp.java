/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import domain.*;
/**
 *
 * @author Professor
 */
public class MainApp {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade();
        cidade1.nome = "Florianópolis";
        cidade1.uf = "SC";
        Cidade cidade2 = new Cidade();
        cidade2.nome = "Palhoça";
        cidade2.uf = "SC";
        
        Aluno aluno1 = new Aluno();
        aluno1.matricula = -123321;
        aluno1.nome = "Fulano";
        aluno1.cpf = "321.123.567-99";
        aluno1.email = "fulano@ifsc.edu.br";
        aluno1.cidade = cidade2;
        print(aluno1);
        
        Aluno aluno2 = new Aluno();
        aluno2.matricula = 543223;
        aluno2.nome = "Ciclano";
        aluno2.cpf = "881.656.347-22";
        aluno2.email = "ciclano@ifsc.edu.br";
        aluno2.cidade = cidade1;
        print(aluno2);
    }
    
    public static void print(Aluno aluno) {
        System.out.println("Dados do aluno");
        System.out.println("Matricula....: " + aluno.matricula);
        System.out.println("Nome.........: " + aluno.nome);
        System.out.println("CPF..........: " + aluno.cpf);
        System.out.println("Email........: " + aluno.email);
        System.out.println("Cidade.......: " + aluno.cidade.nome + "/" 
                + aluno.cidade.uf);
    }
}

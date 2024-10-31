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
        cidade1.setNome("Florianópolis");
        cidade1.setUf("SC");
        Cidade cidade2 = new Cidade();
        cidade2.setNome("Palhoça");
        cidade2.setUf("SC");
        print(cidade1);
        print(cidade2);
        
//        Aluno aluno1 = new Aluno();
//        aluno1.definirMatricula(-123321);
//        aluno1.nome = "Fulano";
//        aluno1.cpf = "321.123.567-99";
//        aluno1.email = "fulano@ifsc.edu.br";
//        aluno1.cidade = cidade2;
//        print(aluno1);
//        
//        Aluno aluno2 = new Aluno();
//        aluno2.definirMatricula(543223);
//        aluno2.matricula = 12321213;
//        aluno2.nome = "Ciclano";
//        aluno2.cpf = "881.656.347-22";
//        aluno2.email = "ciclano@ifsc.edu.br";
//        aluno2.cidade = cidade1;
//        print(aluno2);
    }
    
//    public static void print(Aluno aluno) {
//        System.out.println("Dados do aluno");
//        System.out.println("Matricula....: " + aluno.matricula);
//        System.out.println("Nome.........: " + aluno.nome);
//        System.out.println("CPF..........: " + aluno.cpf);
//        System.out.println("Email........: " + aluno.email);
//        System.out.println("Cidade.......: " + aluno.cidade.nome + "/" 
//                + aluno.cidade.uf);
//    }
    
    public static void print(Cidade cidade) {
        System.out.println("Dados da cidade");
        System.out.println("Nome.....: " + cidade.getNome());
        System.out.println("UF.......: " + cidade.getUf());
    }
}

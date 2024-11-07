/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Aluno
 */
public class Marca {
    private int id;
    private String nome;
    private String paisOrigem;

    public Marca() {
    }
    
    public Marca(String nome) {
        this.nome = nome;
    }
    
    public Marca(String nome, String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    //sobrecarga - overloading
    public Marca(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

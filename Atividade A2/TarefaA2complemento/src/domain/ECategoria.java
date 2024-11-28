/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package domain;

/**
 *
 * @author Aluno
 */
public enum ECategoria {
    PEQUENO(1, "Pequeno"),
    MEDIO(2,"Médio"),
    GRANDE(3,"Grande"),
    MOTO(4,"Moto"),
    PADRAO(5,"Padrão");

    private int id;
    private String descricao;

    private ECategoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

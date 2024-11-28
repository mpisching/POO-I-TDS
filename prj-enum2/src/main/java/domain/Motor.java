/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Aluno
 */
public class Motor {

    private int potencia;

    private ETipoCombustivel combustivel = ETipoCombustivel.GASOLINA;

    public Motor() {
    }

    public Motor(int potencia) {
        this.potencia = potencia;
    }
    
    public Motor(int potencia, ETipoCombustivel tipoCombustivel) {
        this.potencia = potencia;
        this.combustivel = tipoCombustivel;
    }

    public ETipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(ETipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    

}

package br.edu.ifsc.fln.model;

public class Imc {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Imc(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularImc() {
        double imc = peso/(altura*altura);
        return imc;
    }

    public String classificarImc() {

         double imc = calcularImc();

         if (imc >= 30) {
             return "Obesidade";
         }
         else if (imc >= 25) {

             return "Sobrepeso";
         }
         else if (imc >= 18.5) {
             return "Peso normal";
        }
         else {
             return "Abaixo do peso";
        }

    }

    }

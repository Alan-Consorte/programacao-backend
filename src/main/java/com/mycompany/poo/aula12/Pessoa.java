package com.mycompany.poo.aula12;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor padrão
    // Todo método construtor possui o mesmo nome da classe
    public Pessoa() {
        System.out.println("Chamando o construtor padrão");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Chamando construtor 2");
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

    public void setIdade(int nome) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

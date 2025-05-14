package com.mycompany;

public class Aula06Condicional {
    public static void main(String[] args) {
        int num = 3;
        if (num % 2 == 0) {
            System.out.println(num + " é par !!");
        } else {
            System.out.println(num + "é ímpar !!");
        }
        double imc = 24.0;

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso");
        }else if (imc >= 18.5 && imc < 24.5) {
            System.out.println("Está com peso ideal");
        }else {
            System.out.println("Está com obesidade");
        }
    }
}
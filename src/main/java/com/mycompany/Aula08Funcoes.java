package com.mycompany;

public class Aula08Funcoes {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("--- Tabuada do " + numero + "---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
        }
    }

    /**
     * Não podemos declarar funções dentro de outra função
     * 
     * Toda função deve ter um retorno, quando não há retorno utilizado void.
     * 
     * Uma função pode não ter parâmetros, ou ter 1 ou mais.
     */
    public static int multiplicacao(int num, int num2) {
        return num * num2;

    }
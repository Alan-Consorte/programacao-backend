package com.mycompany.avaliac;

public class Avaliacao04 {
    public static void main(String[] args) {
        double precoInicial = 850.00;
        double percentualCorte = 30.0;

        // Calcula o novo preço
        double precoFinal = precoInicial - (precoInicial * percentualCorte / 100);

        // Exibe o resultado
        System.out.println("O preço do produto após o desconto é: R$ " + precoFinal);
    }
}

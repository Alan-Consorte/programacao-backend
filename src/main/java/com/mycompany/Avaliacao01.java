package com.mycompany

public class Avaliacao01 {
    public static void main(String[] args) {
        double areaCirculo = 25; // cm²
        double piValor = Math.PI; // ou use 3.14
        double raio = Math.sqrt(areaCirculo / piValor); // r² = A / π => r = sqrt(A / π)
   
        // Exibe o resultado
        System.out.println("O raio do círculo é: " + raio + " cm.");
    }
}

package com.TDS;
import java.util.Random;
import java.util.Scanner;

public class Sorteador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Sorteador de numeros");
        System.out.print("Quantos números você quer sortear? ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor máximo: ");
        int maximo = scanner.nextInt();

        System.out.println("Números sorteados:");
        for (int i = 0; i < quantidade; i++) {
            int numero = random.nextInt(maximo) + 1; // gera entre 1 e maximo
            System.out.println(numero);
        }

        scanner.close();
    }
}


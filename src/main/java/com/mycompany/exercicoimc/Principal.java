/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicoimc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em Kg): ");
            int peso = scanner.nextInt();

        System.out.print("Digite sua altura (em metros): ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        scanner.close();
    }
}
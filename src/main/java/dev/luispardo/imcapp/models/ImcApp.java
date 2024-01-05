package dev.luispardo.imcapp.models;

import java.util.Scanner;

public class ImcApp {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Ingrese el peso en kilogramos: ");
          double peso = scanner.nextDouble();
          System.out.print("Ingrese la estatura en metros: ");
          double estatura = scanner.nextDouble();

          double imc = calcularIMC(peso, estatura);

          System.out.println("El IMC calculado es: " + imc);

          mostrarResultadoIMC(imc);
        }
    }

    public static double calcularIMC(double peso, double estatura) {
        return peso / Math.pow(estatura, 2);
    }

    public static void mostrarResultadoIMC(double imc) {
        if (imc < 16) {
            System.out.println("Resultado: Delgadez severa");
        }
        if (imc >= 16 && imc < 17) {
            System.out.println("Resultado: Delgadez moderada");
        }
        if (imc >= 17 && imc < 18.5) {
            System.out.println("Resultado: Delgadez leve");
        }
        if (imc >= 18.5 && imc < 25) {
            System.out.println("Resultado: Peso normal");
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("Resultado: Sobrepeso");
        }
        if (imc >= 30 && imc < 35) {
            System.out.println("Resultado: Obesidad leve");
        }
        if (imc >= 35 && imc < 40) {
            System.out.println("Resultado: Obesidad moderada");
        }
        if (imc >= 40) {
            System.out.println("Resultado: Obesidad mórbida");
        }
    }
}


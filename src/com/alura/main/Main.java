package com.alura.main;

import com.alura.models.PairConversion;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("""
                ┌----------------------------------------------------------------------------------------------------┐
                |                                      Conversor de Monedas                                          |
                └----------------------------------------------------------------------------------------------------┘
                """);
        String menu = """
                Opciones disponibles:
                1 - Dólar EEUU     (USD) -→ Peso Argentino (ARS) | 5 - Dólar EEUU      (USD) -→ Peso Colombiano (COP)
                2 - Peso Argentino (ARS) -→ Dólar EEUU     (USD) | 6 - Peso Colombiano (COP) -→ Dólar EEUU      (USD)
                3 - Dólar EEUU     (USD) -→ Real Brasilero (BRL) | 9 - Salir del programa
                4 - Real Brasilero (BRL) -→ Dólar EEUU     (USD) |
                Escriba el múmero de la opción que desea ejecutar:
                »\t""";
        String mensajeMonto = """
                Escriba el monto a convertir:
                »\t""";
        String divisorMenu = "********************************************" +
                "*********************************************************";

        Scanner lectura = new Scanner(System.in);
        int option = 0;
        PairConversion pair = new PairConversion();

        while (option != 9) {
            System.out.print(menu);
            option = lectura.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairUsdArs(amount);
                    System.out.println(amount + " USD " + "equivale a " + converted + " ARS.");
                    System.out.println(divisorMenu);
                }
                case 2 -> {
                    System.out.print(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairArsUsd(amount);
                    System.out.println(amount + " ARS " + "equivale a " + converted + " USD.");
                    System.out.println(divisorMenu);
                }
                case 3 -> {
                    System.out.print(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairUsdBrl(amount);
                    System.out.println(amount + " UDS " + "equivale a " + converted + " BRL.");
                    System.out.println(divisorMenu);
                }
                case 4 -> {
                    System.out.print(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairBrlUsd(amount);
                    System.out.println(amount + " BRL " + "equivale a " + converted + " BRL.");
                    System.out.println(divisorMenu);
                }
                case 5 -> {
                    System.out.print(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairUsdCop(amount);
                    System.out.println(amount + " USD " + "equivale a " + converted + " COP.");
                    System.out.println(divisorMenu);
                }
                case 6 -> {
                    System.out.print(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairCopUsd(amount);
                    System.out.println(amount + " COP " + "equivale a " + converted + " USD.");
                    System.out.println(divisorMenu);
                }
                case 9 -> System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios.");
            }
        }
    }
}

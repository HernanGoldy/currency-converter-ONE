package com.alura.main;

import com.alura.models.PairConversion;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int option = 0;

        System.out.println("***************** Conversor de Monedas ******************");
        String menu = """
                Opciones:
                1 - Dólar EEUU -→ Peso Argentino | 5 - Dólar EEUU -→ Peso Colombiano
                2 - Peso Argentino -→ Dólar EEUU | 6 - Peso Colombiano -→ Dólar EEUU
                3 - Dólar EEUU -→ Real Brasilero | 9 - Salir
                4 - Real Brasilero -→ Dólar EEUU |
                » Escriba el múmero de la opción que desea ejecutar:
                """;

        Scanner lectura = new Scanner(System.in);
        PairConversion pair = new PairConversion();
        String mensajeMonto = "Escriba el monto a convertir: ";

        System.out.print(menu);

        while (option != 9) {
            option = lectura.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairUsdArs(amount);
                    System.out.println(amount + " USD " + "equivale a " + converted + " ARS.");
                }
                case 2 -> {
                    System.out.println(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairArsUsd(amount);
                    System.out.println(amount + " ARS " + "equivale a " + converted + " USD.");
                }
                case 3 -> {
                    System.out.println(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairUsdBrl(amount);
                    System.out.println(amount + " UDS " + "equivale a " + converted + " BRL.");
                }
                case 4 -> {
                    System.out.println(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairBrlUsd(amount);
                    System.out.println(amount + " BRL " + "equivale a " + converted + " BRL.");
                }
                case 5 -> {
                    System.out.println(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairUsdCop(amount);
                    System.out.println(amount + " USD " + "equivale a " + converted + " COP.");
                }
                case 6 -> {
                    System.out.println(mensajeMonto);
                    double amount = lectura.nextDouble();
                    var converted = pair.pairCopUsd(amount);
                    System.out.println(amount + " COP " + "equivale a " + converted + " USD.");
                }
                case 9 -> System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
            }
        }
    }
}

package exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double c, k, f, re, ra;

        System.out.print("Digite a temperatura em Celsius: ");
        c = leitor.nextDouble();

        f = (c * 1.8) + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = f + 459.67;

        System.out.println("Abaixo a temperatura convertida em:");
        System.out.println("Fahrenheit: " + (double)Math.round(f * 100)/100);
        System.out.println("Kelvin: " + (double)Math.round(k * 100)/100);
        System.out.println("Réaumur: " + (double)Math.round(re * 100)/100);
        System.out.println("Rankine: " + (double)Math.round(ra * 100)/100);
    }
}

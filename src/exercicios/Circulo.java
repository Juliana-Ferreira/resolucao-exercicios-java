package exercicios;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double perimetro = 2 * PI * raio;
        double area = PI * Math.pow(raio, 2);

        System.out.println("Perímetro do círculo: " + String.format("%.3f", perimetro));
        System.out.println("Área do círculo: " + String.format("%.3f", area));

        sc.close();
    }
}

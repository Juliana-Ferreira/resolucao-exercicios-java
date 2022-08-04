package exercicios;

import java.util.Scanner;

public class CarroNovo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço de fábrica do carro desejado: ");
        double fabrica = sc.nextDouble();

        double valorFinal = fabrica + fabrica * 0.28 + fabrica * 0.45;

        System.out.println("Valor final ao consumidor: R$" + String.format("%.2f", valorFinal));

        sc.close();
    }
}

package exercicios;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double volume, raio, altura;

        System.out.print("Digite o raio do cilindro: ");
        raio = leitor.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        altura = leitor.nextDouble();

        volume = Math.PI*(raio*raio)*altura;
        System.out.println("O volume do cilindro é: " + (double)Math.round(volume*100)/100);
    }
}

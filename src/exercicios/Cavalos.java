package exercicios;

import java.util.Scanner;

public class Cavalos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final double C = 745.6999;
        double cavalos, massa, altura, tempo;

        System.out.print("Digite a massa em quilogramas(Kg): ");
        massa = leitor.nextDouble();
        System.out.print("Digite a altura em metros(m): ");
        altura = leitor.nextDouble();
        System.out.print("Digite o tempo em segundos (s): ");
        tempo = leitor.nextDouble();

        cavalos = ((massa*altura)/tempo)/C;
        System.out.println("A quantidade necessária de cavalos para levantar " + massa + " Kg é " + String.format("%.4f", cavalos));
    }
}

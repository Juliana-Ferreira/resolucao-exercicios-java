package exercicios;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int func;
        double vetor[], media = 0;

        System.out.print("Digite a quantidade de funcionários: ");
        func = leitor.nextInt();

        vetor = new double[func];

        for(int i=0; i<vetor.length; i++) {
            System.out.println("Digite o salário do " + (i+1) + "º funcionário: ");
            vetor[i] = leitor.nextDouble();
            media += vetor[i];
        }

        media = media/vetor.length;
        System.out.println("A média salarial dos funcionários é: R$" + String.format("%.2f", media));
    }
}

package exercicios;

import java.util.Scanner;

public class ValorRepetido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[10];

        for(int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor da posição " + i + " do vetor: ");
            vet[i] = sc.nextInt();

            for(int j = 0; j < vet.length; j++) {
                if (vet[j] == vet[i] && i != j) {
                    System.out.println("O número " + vet[i] + " se repete na posição " + i);
                    break;
                }
            }
        }
        sc.close();
    }
}

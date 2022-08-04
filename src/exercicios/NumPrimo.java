package exercicios;

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos dentro do intervalo:");
        for(int i = inicio; i <= fim; i++) {
            int cont = 0;

            for(int j = 2; j < i; j++) {
                if(i % j == 0)
                    cont++;
            }

            if(cont == 0)
                System.out.print(i + " ");
        }

        sc.close();
    }
}

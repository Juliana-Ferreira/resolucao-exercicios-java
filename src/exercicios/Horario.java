package exercicios;

import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeg, faltaSeg;

        System.out.print("Digite a hora: ");
        int horas = sc.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Digite os segundos: ");
        int segundos = sc.nextInt();

        totalSeg = segundos + (minutos * 60) + (horas * 3600);
        faltaSeg = (24 * 3600) - totalSeg;

        System.out.println("Se passaram " + totalSeg + " segundos desde o início do dia.");
        System.out.println("Faltam " + faltaSeg + " segundos para terminar o dia.");

        sc.close();
    }
}

package exercicios;

import java.util.Scanner;

public class Parede {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double hp, lp, ha, la, qtd;

        System.out.print("Digite a altura da parede: ");
        hp = leitor.nextDouble();
        System.out.print("Digite a largura da parede: ");
        lp = leitor.nextDouble();
        System.out.print("Digite a altura do azulejo: ");
        ha = leitor.nextDouble();
        System.out.print("Digite a largura do azulejo: ");
        la = leitor.nextDouble();

        qtd = (hp*lp)/(ha*la);
        System.out.println("A quantidade de azulejos necessários é: " + Math.round(qtd));

    }
}

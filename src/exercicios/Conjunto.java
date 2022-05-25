package exercicios;

import javax.swing.*;

public class Conjunto {
    public static void main(String[] args) {

        int sexo, somaMulher = 0;
        double altura, maior = 0, menor = 10;
        double somaHomem = 0;
        double mediaHomem = 0;

            for (int i=0; i<10; i++){

                sexo = Integer.parseInt(JOptionPane.showInputDialog("Selecione o sexo:" +
                        "\n1 - Masculino" +
                        "\n2 - Feminino"));
                switch (sexo) {
                    case 1:
                        somaHomem += 1;
                        break;
                    case 2:
                        somaMulher += 1;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                }
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));

                if (altura > maior) maior = altura;
                if (altura < menor) menor = altura;
                if (sexo == 1) mediaHomem += altura;
            }

            mediaHomem = mediaHomem/somaHomem;

            JOptionPane.showMessageDialog(null, " A maior altura do grupo é: " + maior +
                    "\n A menor altura do grupo é: " + menor +
                    "\n A média de altura dos homens é: " + String.format("%.2f", mediaHomem) +
                    "\n O número de mulheres no conjunto é: " + somaMulher);

    }
}

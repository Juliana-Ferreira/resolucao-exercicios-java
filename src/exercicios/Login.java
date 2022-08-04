package exercicios;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = 1234, password = 9999;

        System.out.print("Insira o código de acesso: ");
        int userCode = sc.nextInt();
        while(userCode != code) {
            System.out.print("Usuário inválido. Tente novamente: ");
            userCode = sc.nextInt();
        }

        System.out.print("Digite a senha: ");
        int userPassword = sc.nextInt();

        if(userPassword == password)
            System.out.println("Acesso permitido.");
        else
            System.out.println("Senha incorreta. Acesso negado.");

        sc.close();
    }
}

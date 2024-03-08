package org.example.insecure.v2;

import java.util.Scanner;

public class InsecureCodeExmple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();

        System.out.println("Autenticando usuário: " + username + " com senha: " + password);
    }
}
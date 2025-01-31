package application;

import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos vao ser alugados? ");
        int quantidadeQuartos = sc.nextInt();
        sc.nextLine();

        Rent[] quartos = new Rent[10];

        for (int i = 0; i < quantidadeQuartos; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room:");
            int quartoEscolhido = sc.nextInt();
            sc.nextLine();

            quartos[quartoEscolhido] = new Rent(name, email);
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < quartos.length; i++) {
            if(quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getName() + "," + quartos[i].getEmail());
            }
        }
    }
}

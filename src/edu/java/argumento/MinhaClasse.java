package edu.java.argumento;
import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome");
        String nome2 = scanner.next();
        System.out.println("Digite seu sobrenome");
        String sobreNome2 = scanner.next();
        System.out.println("Digite sua Idade");
        int idade2 = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura2 = scanner.nextDouble();

        System.out.println("ola, me chamo "+nome2+ " "+sobreNome2);
        System.out.println("Tenho " + idade2 +" anos");
        System.out.println("Minha altura é "+ altura2 +" cm");


    }
}

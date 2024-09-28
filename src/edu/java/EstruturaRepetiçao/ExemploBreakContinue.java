package edu.java.EstruturaRepetiçao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("Exemplo usando break");
        for (int numero =1; numero<=5; numero++){
            if (numero == 3)
                break;

            System.out.println(numero);
        }
        System.out.println("Exemplo usando continue");
        for (int numero =1; numero<=5; numero++){
            if (numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}

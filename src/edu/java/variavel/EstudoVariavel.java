package edu.java.variavel;

public class EstudoVariavel {
    public static void main(String[] args) {
       // tipos de variaveis
            int numeroInteiro;
            byte numeroEmByte;
            short numeroCur;
            double numeroDecimal = 2000.33;
            String textoExemplo ="Bruno Souza";
            long palavraLonga;
        // exemplo para uso de cast
            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal; // aqui dei exemplo de uma var pequena querendo receber var maior se utiliza comando cast
        // exemplo de variavel constante, onde o java nao deixa alterar seu valor
            final double VALOR_DE_PI = 3.14;  // nome da variavel tem que ser caixa alta
            System.out.println(VALOR_DE_PI);
            System.out.println(textoExemplo);
            System.out.println(numeroCurto2);

    }
}

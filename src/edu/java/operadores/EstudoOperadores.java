package edu.java.operadores;

public class EstudoOperadores {
    public static void main(String[] args) {
        // classe Operadores java
            double soma = 10.5 + 2.3;
            int subtracao = 113 -100;
            int mutiplicacao = 20*12;
            int divisao = 40 / 5;
            int modulo = 50 % 3;
            double resultado = (10 * 7) + (20 / 5);

                System.out.println(soma);
                System.out.println(subtracao);
                System.out.println(mutiplicacao);
                System.out.println(divisao);
                System.out.println(modulo);
                System.out.println(resultado);

        // concatenação de texto (consegue somar duas palavras

            String nomeCompleto = "Bruno" + " Souza";

                System.out.println(nomeCompleto);

            String concatenacao = "?";
                System.out.println(concatenacao);

            concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);

            concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao);

         // Operadores unario

            int numero = 5;
                System.out.println(numero);
            numero = - numero;
                System.out.println(numero);
            numero = - numero;                     // para retornar o numero negativo para positivo usar - com - igual a +
                System.out.println(numero);

         // Repetição
            numero ++; // è a mesma coisa que  numero = numero + 1
                System.out.println(numero);
                System.out.println(-- numero);

            boolean mentira = true;
                System.out.println(!mentira);
                System.out.println(mentira);
            mentira = !mentira;
                System.out.println(mentira);

        // ternário condição como se fosse if

            int a,b;

            a = 5;
            b = 6;

            String totalResultado = "";  // como é feito com if
            if(a==b)
                totalResultado = "verdadeiro";
            else
                totalResultado = "Muito falso";

            System.out.println(totalResultado);

            String totalResultadoDois = a==b ?"muito verdadeiro" : "totalmente falso";

            System.out.println(totalResultadoDois);

        // relacionado

            int numero1 = 1;
            int numero2 = 2;

            boolean simNao = numero1 == numero2;
                System.out.println("O numero 1 é igual o numero 2?" + simNao);

            simNao = numero1 != numero2;
                System.out.println("O numero 1 é diferente que o numero 2?" + simNao);

            simNao = numero1 > numero2;
                System.out.println("O numero 1 é maior que o numero 2?" + simNao);

            String nome1 = "Bruno";
            String nome2 = new String("Bruno");
                System.out.println(nome1 == nome2);
                System.out.println(nome1.equals(nome2));

        // espressoes && (E) || (OU)

            boolean cond1 = true;
            boolean cond2 = false;

            if (cond1 && cond2){
                System.out.println("a naty faria doce na hora do trabalho");
            }
            if (cond1 || cond2){
                System.out.println("A naty canta no chuveiro");
            }

    }
}

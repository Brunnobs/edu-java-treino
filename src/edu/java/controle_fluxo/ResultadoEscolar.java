package edu.java.controle_fluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
        // condicionamento encadeados
        if (nota >= 7)
            System.out.println("Eu gosta assim AMOSTRADINHO");
        else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno em recuperação");

        } else
            System.out.println("Reprovado");

        // Condicionamento ternário

        String resultado = nota >= 7 ? "Aprovado":"Reprovado";
        System.out.println(resultado);

        // // Condicionamento ternário else if

        resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}

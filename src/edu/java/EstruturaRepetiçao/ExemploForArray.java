package edu.java.EstruturaRepetiçao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
            // forma 1 de fazer
          for (int x=0; x < alunos.length; x++){
             System.out.println("O aluno do indice x = "+x+" é "+alunos[x]);
          }
           // forma 2 de fazer
        for (String aluno : alunos) {
            System.out.println("O aluno do indice x = " + aluno);

        }
    }
}

package edu.java.controle_fluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 125.00;
        double valorSolicitado = 54.00;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo =R$"+saldo);
        }
        else
            System.out.println("Saldo insuficiente");
    }
}

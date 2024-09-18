package edu.java.projetos;

public class UsuarioTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada?"+ smartTv.ligada);
        System.out.println("Canal atual?"+smartTv.canal);
        System.out.println("Qual volume?"+smartTv.volume);

        System.out.println("Ligar TV");
        smartTv.ligar();
        System.out.println("---Atualizado Tv Ligada?"+ smartTv.ligada);
        System.out.println("Desligar TV");
        smartTv.desligar();
        System.out.println("---Atualizado Tv Ligada?"+ smartTv.ligada);
        System.out.println("Aumentar Volume");
        smartTv.aumentarVolume();
        System.out.println("---Aumentando volume da Tv: Vol "+ smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("---Aumentando volume da Tv: Vol "+ smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("---Aumentando volume da Tv: Vol "+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("---Diminuir volume da Tv: Vol "+ smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("---Diminuir volume da Tv: Vol "+ smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("---Diminuir volume da Tv: Vol "+ smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("---Próximo canal da Tv: Ch "+ smartTv.canal);

        smartTv.mudarCanal(21);
        System.out.println("---Canal da SBT: Ch "+ smartTv.canal);
    }
}

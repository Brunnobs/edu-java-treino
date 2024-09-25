package edu.java.controle_fluxo;

public class PlanoCelular {
    public static void main(String[] args) {
        String planoCelular = "T"; // B = Basico, M = Midia, T = Turbo
            switch (planoCelular){
                case "T": {
                    System.out.println("5G Youtube");
                }
                case "M": {
                    System.out.println("Whats e Instagram grátis");
                }
                case "B": {
                    System.out.println("100 minutos de ligação");
                }
            }

    }
}

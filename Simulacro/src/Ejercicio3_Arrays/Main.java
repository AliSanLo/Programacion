package Ejercicio3_Arrays;

public class Main {
    static double[] temperaturas = new double[12];
    static double[] prob_lluvia = new double[12];
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

   static public void lluvioso() {
        int mayor = 0;
        double aux = 0;
        for (int i = 0; i < prob_lluvia.length; i++) {
            if (prob_lluvia[i] > aux) {
                mayor = i;
                aux = prob_lluvia[i];
            }

        }
        System.out.println("El mes mas lluvioso es" + meses[mayor]);
    }

    public static void main(String[] args) {

        System.out.println("Las temperaturas media de cada mes este año son la siguientes");
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.round((Math.random() * 360)) / 10.0;
            System.out.print(" | " + temperaturas[i] + " | ");
        }

        System.out.println("\n" + "Las probabilidades de lluvida de cada mes son las siguientes: ");
        for (int i = 0; i < prob_lluvia.length; i++) {
            prob_lluvia[i] = Math.round(Math.random() * 1000) / 10.0;
            System.out.print(" | " + prob_lluvia[i] + " | ");
        }
lluvioso();


    }
}

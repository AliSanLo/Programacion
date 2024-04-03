package Poo1;

import java.util.Scanner;

public class Centralita {
    private int costeAcumulado;

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

    public Centralita() {
        this.costeAcumulado = 0;
    }
    public void agregarLocal(LlamadaLocal auxLocal){
        Scanner scn = new Scanner (System.in);
        System.out.println("Cuanto tiempo estuviste en llamada?");
        costeAcumulado= scn.nextInt();
    }
    public void  agregarNacional(LlamadaNacional auxNacional) {



    }
}

package Ej13;

import java.util.Scanner;

public class Moneda {
    public String nombre;
    public int precio = 20000;
    public int cantidad;
    private StringBuilder banco;

    public Moneda() {
        this.banco = new StringBuilder();
    }

    public StringBuilder getBanco() {
        return banco;
    }

    Scanner scn = new Scanner(System.in);

    public int calcPrecioMoneda(int cantidad, int precio) {
        int total = 0;
        if (cantidad == 0) {
            System.out.println("Introduce la catidad de monedas que tienes");
            cantidad = scn.nextInt();
            banco.append(cantidad);
        } else {
            banco.append(cantidad);
            total = precio * cantidad;
        }
        banco.append(total);

        return total;

    }

}

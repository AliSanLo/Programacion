package Ejercicio1_POO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nif {
    public int dni;
    public String letra;
    StringBuilder sb;

    public Nif() {
        sb = new StringBuilder();

    }

    //Un constructor por defecto.
    public Nif(int dni, String letra) {
        sb = new StringBuilder();
        this.dni = dni;
        this.letra = letra;
    }

    //TERMINAR: Un constructor que reciba como parámetro el DNI y calcule y asigne la letra que le corresponde.
    public Nif(int dni) {
        sb = new StringBuilder();
        letra = calculoLetra(dni);
    }

    /*Un método leer(): que pida por teclado el número de DNI y calcule a partir del DNI
             introducido la letra que le corresponde.*/

    public void leer() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Dame el dni, son 8 digitos: ");
        int digitos = scn.nextInt();
        int dig = digitos;
        int contador = 0;
        while (digitos != 0) {
            digitos = digitos / 10;
            contador++;
        }

        if (contador == 8 || contador == 7) {
            letra = calculoLetra(dig);

        } else {
            System.out.println("Introduce un numero de 8 cifras");
        }
        dni = dig;

        System.out.println(toString());
    }

    /*Método toString() que muestre el NIF de la siguiente forma: ocho dígitos, un guion y
        la letra en mayúscula. Por ejemplo: 12345678-Z. Usa la clase StringBuilder para crear un String.*/
    @Override
    public String toString() {
        sb.append(dni);
        sb.append(" - ");
        sb.append(letra);
        return sb.toString();
    }

    //La letra del NIF se calculará usando un método privado
    private static String calculoLetra(int dni) {
        String[] array = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resto = dni % 23;
        return array[resto];
    }
}

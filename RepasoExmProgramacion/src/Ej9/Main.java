package Ej9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce peso:");
        double peso = scn.nextDouble();

        System.out.println("Introduce altura:");
        double altura = scn.nextDouble();

        Persona  p = new Persona();
        System.out.println( p.calcularIMC(peso,altura));
        double tipo = p.calcularIMC(peso,altura);

        if (tipo < 18.5){
            System.out.println("Inferior a lo normal");
        }if(tipo > 18.5 && tipo < 24.9){
            System.out.println("Normal");
        }if (tipo > 25.0 && tipo < 29.9){
            System.out.println("Peso superior al normal");
        }if (tipo >= 30){
            System.out.println("Gordo, gordo, gordo, mileurista, mileurista, gordo, gordo");
        }
    }
}

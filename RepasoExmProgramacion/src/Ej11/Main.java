package Ej11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Triangulo t1 = new Triangulo(4, 6);
        Circulo c1 = new Circulo(10, 20, 60);
        Cuadrado cu1 = new Cuadrado(4, 6);

        System.out.println("La base del rectangulo es" + cu1.base);

        int op = 0;
        do {
            System.out.println("QUE QUIERES CALCULAR?" +
                    "\n 1.-Triangulo" +
                    "\n 2.- Circulo" +
                    "\n 3.- Cuadrado");

             op = scn.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La bsae del triangulo es: " + t1.base + "" +
                            "\n La altura es : " + t1.altura + "" +
                            "\n Su area es de: " + t1.areaTriangulo());
                    break;
                case 2:
                    System.out.println("El radio del circulo es: " + c1.radio + "" +
                            "\n El diametro es : " + c1.diametroCirculo() + "" +
                            "\n Su area es de: " + c1.areaCirculo());
                    break;
                case 3:
                    System.out.println("La bae del cuadrado es: " + cu1.base + "" +
                            "\n La altura es : " + cu1.altura + "" +
                            "\n Su area es de: " + cu1.perimetroCuadrado() + "" +
                            "\n Su perimetro es de : " + cu1.perimetroCuadrado());
                    break;
                case 4:
                    break;
            }
        } while (op != 4);
    }
}



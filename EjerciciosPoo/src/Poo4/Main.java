package Poo4;

import java.util.Arrays;

public class Main {
    /*
    UN ARRASY TRIDIMENSIONAL SERÍA ASI:
    int[][][] ventas = {
            {
                    {5, 10, 6, 2, 8},
                    {4, 5, 6, 1, 0}
            },
            {
                    {6, 9, 6, 9, 4},
                    {4, 5, 6, 1, 0}
            },
            {
                    {5, 10, 6, 2, 8},
                    {4, 5, 6, 1, 0}
            }; */
    int[][][] array = new int[4][5][1];

    public Main(int[][][] array) {
        this.array = array;
    }

    public Main() {
    }


    public void imprimirArray() {

        for (int i = 0; i < array.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10) + 1;
                    System.out.print(" | " + array[i][j][k] + " | ");
                }
            }
            System.out.println();
        }
    }

    public void cantidadTotal() {
        imprimirArray();
        for (int i = 0; i < array.length; i++) {
            int aux = 0;
            for (int j = 0; j < array[i].length; j++) {
                aux += array[i][j][0];
            }
            System.out.println("Cantidades totales del Artículo " + (i + 1) + ": " + aux);
        }
    }

    public void artSuc2() {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[2].length; j++) {
                contador++;
            }
        }
        /*CHAT GPT HIZO ESTO:
        for (int i = 0; i < array.length; i++) {
        // Si la sucursal 2 tiene al menos un artículo
        if (array[i].length > 2) {
            contador++;
        }
    }*/

        System.out.println("Cantidad de articulos en la sucursal 2 : " + contador);
    }

    public void art3suc1() {
        imprimirArray();
        int valorArticulo3Sucursal1 = array[1][3][0]; //no entiendo como funcionan las posiciones
        System.out.println(valorArticulo3Sucursal1);

    }

    public void recTotal() {
        imprimirArray();

        for (int i = 0; i < array.length; i++) {
            int aux = 0;
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    aux += array[i][j][k];
                }
            }
            System.out.println("Sucursal : " + (i + 1) + " -> " + aux);

        }

    }

    public void recaTotal() {
        imprimirArray();
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    aux += array[i][j][k];
                }
            }
        }
        System.out.println("Recaudacion total: " + aux);
    }

    public void mayRec() {
        imprimirArray();
        int aux = 0;
        int mayor = 0;
        int maySuc = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    aux += array[i][j][k];

                    if (aux > mayor) {
                        mayor = aux;
                        maySuc = i;
                        ;
                    }

                }

            }
            System.out.println("Sucursal : " + (i + 1) + " -> " + aux);

        }
        System.out.println("La sucursal con mayor recaudacion es: " + maySuc + "->" + mayor);

    }


    public static void main(String[] args) {

        Main a = new Main();
        // a.cantidadTotal();
        // a.imprimirArray();
        //a.artSuc2();
        //a.art3suc1();
        // a.recTotal();
        //a.recaTotal();
        a.mayRec();
    }
}




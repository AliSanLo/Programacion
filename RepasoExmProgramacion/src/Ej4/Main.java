package Ej4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("INTRODUCE 1 palabra:");
        String palabra = scn.nextLine();
        if (palabra.length() < 4){
            String mayus = palabra.toUpperCase() ;
            System.out.println(mayus);
        }else{
            String min = palabra.toLowerCase();
            System.out.println(min);
        }

        }

    }

package Ej8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/Alicia/IdeaProjects/RepasoExmProgramacion/src/Ej8/texto.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea;
        int contFrase = 0;
        int contPalabra = 0;
        int conLetra = 0;
        while ((linea = br.readLine()) != null) {
            String[] frases = linea.split("\\.");
            contFrase += frases.length;//un split genera un array de strings

            String[] palabras = linea.replace(",", "").replace(".","").split(" ");
            contPalabra += palabras.length;//un split genera un array de strings

            for (int i = 0; i < palabras.length; i++) {
                conLetra += palabras[i].length();

            }
        }
        System.out.println("Frase" + contFrase);
        System.out.println("Palabra" + contPalabra);
        System.out.println("letra" + conLetra);


    }
}
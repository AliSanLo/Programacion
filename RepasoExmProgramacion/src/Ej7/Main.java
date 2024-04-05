package Ej7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Alicia\\IdeaProjects\\RepasoExmProgramacion\\src\\Ej7\\texto.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));

        String linea = br.readLine();

        String [] s= linea.split(" ");

        for(int i = 0 ; i < s.length ; i++){
            System.out.print((char)Integer.parseInt(s[i]));
            //PARA CONVERTIR NUMEROS A CHAR
        }

    }
}

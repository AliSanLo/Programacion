package POO4_SieteReinos;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int op = 0;
        HashMap<String, CasaNoble> hm = new HashMap<>();

        do {
            CasaNoble cn = new CasaNoble();

            System.out.println("MENU:" +
                    "\n 1.- Añadir casa" +
                    "\n 2.- Eliminar casas por nombre" +
                    "\n 3.-Buscar Casas por nombre para ver informacion" +
                    "\4.-Salir");
            op = scn.nextInt();
            switch (op) {
                case 1:
                    cn.anadirCasas(hm);
                    break;
                case 2:
                    System.out.println("Que casa quieres eliminar?");
                    scn.nextLine();
                    String nombreCasa = scn.nextLine();
                    cn.eliminarCasa(hm, nombreCasa);
                    break;
                case 3:
                    System.out.println("Que casa quieres buscar?");
                    scn.nextLine();
                    nombreCasa = scn.nextLine();

                    cn.buscarCasa(hm, nombreCasa);
                    break;

                case 4:
                    break;

            }
        } while (op != 4);

    }
}


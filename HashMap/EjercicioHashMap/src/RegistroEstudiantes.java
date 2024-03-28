import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroEstudiantes {
    Scanner scn = new Scanner(System.in);
    HashMap<Integer, Estudiante> hm = new HashMap<>();

    public void anadirEstudiante(Estudiante estudiante) {
        System.out.println("Ingresa un nuevo estudiante. Comienza con el id");
        int id = scn.nextInt();
        if (hm.containsKey(id)) {
            System.out.println("Este estudiante ya está registrado");
        } else {
            hm.put(id);

        }
    }

    public void buscarEstudiante(int id) {
        System.out.println("Introduce el id del estudiante que quieras buscar");
        id = scn.nextInt();

        for (int i : hm.keySet()) {
            if (hm.containsKey(id)) {
                System.out.println("Este estudiante está en el HashMap");
                System.out.println(hm.get(i));
            } else {
                System.out.println("Este estudiante NO está en el HashMap");

            }

        }
    }

    public void eliminarEstudiante(int id) {
        System.out.println("Introduce el id del estudiante que quieras eliminar");
        id = scn.nextInt();
        for (int i : hm.keySet()) {
            if (hm.containsKey(id)) {
                System.out.println("Estudiante encontrado: ");
                System.out.println(hm.get(i));
                System.out.println("Borrando...");
                hm.clear();

            } else {
                System.out.println("Este estudiante NO está registrado");

            }
        }
    }

}

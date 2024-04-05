package POO4_SieteReinos;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class CasaNoble {
    Scanner scn = new Scanner(System.in);
    public String nombreCasa, lema, escudo;

    @Override
    public String toString() {
        return
                " nombreCasa='" + nombreCasa + '\'' +
                        ", lema='" + lema + '\'' +
                        ", escudo='" + escudo + '\'' +
                        '}';
    }

    public CasaNoble(String nombreCasa, String lema, String escudo) {
        this.nombreCasa = nombreCasa;
        this.lema = lema;
        this.escudo = escudo;


    }

    public String getNombreCasa() {
        return nombreCasa;
    }

    public void setNombreCasa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }


    public CasaNoble() { //PARA PODER UTILIZAR EL METODO anadirCasas (Necesitaba un constructor vacio?)
    }

    public void anadirCasas(HashMap hm) {
        System.out.println("NombreCasa");
        nombreCasa = scn.nextLine();
        System.out.println("Lema");
        lema = scn.nextLine();

        System.out.println("Escudo");
        escudo = scn.nextLine();

        setNombreCasa(nombreCasa);
        setLema(lema);
        setEscudo(escudo);

        //METEMOS EN EL HASHMAP
        hm.put(nombreCasa, this);

    }

    public void eliminarCasa(HashMap hm, String nombreCasa) {
        if (hm.containsKey(nombreCasa)) {
            hm.remove(nombreCasa);

        } else {
            System.out.println("No existe esa casa");
        }
    }

    public void buscarCasa(HashMap<String, CasaNoble> hm, String nombreCasa) {
        if (hm.containsKey(nombreCasa)) {
            System.out.println(hm.get(nombreCasa)); // por que cn y no casaNoble como esta en el hashmap?
        } else {
            System.out.println("No existe esa casa");
          /*  for (String key : hm.keySet()) {
                CasaNoble valor = hm.get(key);
                System.out.println("Clave: " + key + ", Valor: " + valor);

            }*/

        }
    }
}

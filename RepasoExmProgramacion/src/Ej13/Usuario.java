package Ej13;

import java.util.HashMap;
import java.util.Scanner;

public class Usuario {
    Scanner scn = new Scanner(System.in);
    HashMap<HashMap, StringBuilder> identificador = new HashMap<>();

    //INSTANCIA DE LA CLASE MONEDA PARA PODER UTILIZAR SUS ATRIBUTOS AQUI?
    Moneda m = new Moneda();
    //TRAER PARA ACA EL STRINGBUILDER PARA PODER TRBAJA CON EL
    StringBuilder sb = m.getBanco();

    public HashMap<HashMap, StringBuilder> getIdentificador() {
        identificador.put(cuenta, sb);
        return identificador;
    }

    HashMap<String, String> cuenta = new HashMap<>();


    public void signIn(int monedas) {

        System.out.println("Introduce tu usuario o id");
        String usuario = scn.nextLine();

        System.out.println("Introduce tu contraseña : ");
        String contraseña = scn.nextLine();

        cuenta.put(usuario, contraseña);

        int id = (int) Math.round(Math.random() * 10 + 1);
        identificador.put(c)


    }

    public void signIn() {

    }


}

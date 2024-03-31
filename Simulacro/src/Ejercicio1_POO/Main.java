package Ejercicio1_POO;


public class Main  {
    public static void main(String[] args) {
        System.out.println(new Nif(2987));
        Nif n1 = new Nif ();
        Nif n2 = new Nif (23453355);
        Nif  n3 = new Nif  ();

        n1.leer();
        n2.leer();

    }
}

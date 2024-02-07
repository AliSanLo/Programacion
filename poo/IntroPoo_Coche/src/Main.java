import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche("Rojo","Seat",100);
        Coche coche2 = new Coche(coche1);
        Coche coche3 = new Coche();

        System.out.println(coche1);
        System.out.println(coche2);




    }


}


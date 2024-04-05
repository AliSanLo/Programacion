package POO_Hobbit;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<CompaniaAnillo> array = new ArrayList<CompaniaAnillo>();

        array.add(new Humano());
        array.add(new Hobbit());
        array.add(new Elfo());
        for (int i =0; i< array.size(); i++){
            array.get(i).habilidad();
            System.out.println(array.get(i));

        }

    }
}

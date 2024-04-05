package poo2_HarryPotter;

public class Bruja extends Personaje implements Magico{
    public Bruja(String nombre) {
        super(nombre);
    }

    @Override
    public void moverse() {
        System.out.println("bruja se mueve");

    }



}

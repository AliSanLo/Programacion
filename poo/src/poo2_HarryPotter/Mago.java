package poo2_HarryPotter;

public class Mago extends Personaje implements Magico {
    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void lanzarHechizo(String hechizo) {
        System.out.println("tonto");
    }

    @Override
    public void moverse() {
        System.out.println("Mago se mueve");

    }
}

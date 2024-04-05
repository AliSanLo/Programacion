package poo2_HarryPotter;

public abstract class Personaje {
    public String nombre;

    public abstract void moverse();

    public String getNombre() {
        return nombre;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
    }
}

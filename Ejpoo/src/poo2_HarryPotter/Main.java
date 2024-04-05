package poo2_HarryPotter;

public class Main {
    public static void main(String[] args) {

        Mago merlin = new Mago("merlin");
        Bruja elviruja = new Bruja("elviruja");

merlin.lanzarHechizo("bum");
elviruja.lanzarHechizo("pimba");
merlin.moverse();
elviruja.moverse();
    }
}
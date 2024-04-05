package poo2_HarryPotter;

public interface Magico {
    public default void lanzarHechizo(String hechizo){
        System.out.println(hechizo);
    }
}

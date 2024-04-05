package POO_Hobbit;

public interface Ataque {

    public default void ataque(){
        System.out.println("Ataca");
    }
}

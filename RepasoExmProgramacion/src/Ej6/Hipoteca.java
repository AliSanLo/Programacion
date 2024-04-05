package Ej6;

public class Hipoteca {
    public boolean hipoteca(int cantidadPedida, int anosDevolver, int interes) {
        boolean concede = true;
        if (cantidadPedida > 500000 && anosDevolver > 40) {
            concede = true;
            return concede;

        } else {
            concede = false;
            return concede;
        }
    }

}

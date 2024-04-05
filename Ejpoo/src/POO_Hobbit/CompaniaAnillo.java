package POO_Hobbit;

public abstract class CompaniaAnillo {
    @Override
    public String toString() {
        return "CompaniaAnillo{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + "habilidad" ;
    }

    public String nombre;
    public String raza;

public abstract  void habilidad();
}


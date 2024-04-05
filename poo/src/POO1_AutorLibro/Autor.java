package POO1_AutorLibro;

public class Autor {
    public String nombre, email;
    public boolean genero;

    public Autor(String nombre, String email, boolean genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    @Override
    public String toString() {
        String gen;
        if(genero){
            gen = "mujer";
        }else{
            gen = "hombre";
        }
        return "Autor : " + nombre +
                ", email : " + email + ", genero : " + gen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
}

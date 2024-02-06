public class Coche {

    //Atributos -> Caracteristicas de un objeto
    // modificador de acceso + tipo + nombre
    public String color;
    public String marca;
    public int km;

    //Métodos -> Acciones / comportamientos
    //Métodos constructores -> con parametros, defecto, copia

    public Coche(String color, String marca, int km){
        this.color = color;
        this.marca = marca;
        this.km = km;

    }
    public Coche(){

    }

    public Coche(Coche c){
        this.color = c.color;
        this.km = c.km;
        this.marca = c.marca;
    }

    //SOBRECARGA DE MÉTODOS
    public void holaMundo(){
        System.out.println("Hola mundo");
    }

    public void holaMundo(String nombre){
        System.out.println("Hola mundo "+nombre);
    }

    public void holaMundo(String texto,int num){
        System.out.println("Hola mundo "+texto+" num: "+num);
    }

    public String toString(){
        return "Color: "+this.color+" marca: "+this.marca+" km: "+this.km;
    }

}

package Ej10;

public class Asignatura {
    private int id ;
    private double calificacion;

    public Asignatura(int id) {
        this.id = id;
    }


    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

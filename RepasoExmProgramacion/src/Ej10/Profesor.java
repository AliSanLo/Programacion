package Ej10;

public class Profesor {
    public void ponerNotas(Alumno alumno) {

        Asignatura asignatura1 = alumno.getAs1();
        Asignatura asignatura2 = alumno.getAs2();
        Asignatura asignatura3 = alumno.getAs3();

        asignatura1.setCalificacion((int) Math.round(Math.random() * 10 + 1));
        asignatura2.setCalificacion((int) Math.round(Math.random() * 10 + 1));
        asignatura3.setCalificacion((int) Math.round(Math.random() * 10 + 1));

        System.out.println("Alumno: " + alumno);
        System.out.println("Asignatura 1: " + asignatura1.getId() + ", Calificación: " + asignatura1.getCalificacion());
        System.out.println("Asignatura 2: " + asignatura2.getId() + ", Calificación: " + asignatura2.getCalificacion());
        System.out.println("Asignatura 3: " + asignatura3.getId() + ", Calificación: " + asignatura3.getCalificacion());
    }
}

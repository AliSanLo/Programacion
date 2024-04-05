package Ej10;

public class Main {
    public static void main(String[] args) {
        //ENUNCIADO
        /*Realiza una aplicación para gestionar alumnos y profesores. Para ello

a.	Crea una clase llamada Asignatura que:
•	Tenga dos atributos private de tipo int (identificador) y de tipo double (calificación).
•	Tenga un constructor con un parámetro de tipo int.
•	Tenga un getter para cada uno de los atributos.
•	Tenga un setter para la calificación.

b.	Crea una clase llamada Alumno que:
•	Tenga tres atributos private de tipo Asignatura.
•	Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
•	Tenga un constructor con tres parámetrosde tipo int que inicialice los tres atributos.
•	Tenga un getter para cada uno de los atributos.
c.	Crea una clase llamada Profesor que:
•	Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
•	Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve un double.
d.	Desarrollar una clase llamada Entrada que en su método main:
•	Registrar asignatura. Cree e inicialice tres Asignaturas con valores introducidos manualmente
•	Cree un Alumno con las tres Asignaturas con valores introducidos manualmente.
•	Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno con valores introducidos manualmente.
•	Comprueba mediante impresiones por pantalla las notas de cada alumno

*/
        Asignatura historia = new Asignatura(1);
        Asignatura latin = new Asignatura(2);
        Asignatura lengua = new Asignatura(3);

        Alumno ali = new Alumno(1, 2, 3);
        Alumno alex = new Alumno(1, 2, 3);
        Alumno sara = new Alumno(1, 2, 3);
        Alumno angy = new Alumno(1, 2, 3);

        Profesor alguien = new Profesor();
        alguien.ponerNotas(alex);
        alguien.ponerNotas(sara);
        alguien.ponerNotas(angy);
    }
}

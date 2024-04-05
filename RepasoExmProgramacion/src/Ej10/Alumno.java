package Ej10;

public class Alumno {
    private Asignatura as1;
    private Asignatura as2;
    private Asignatura as3;

    public Alumno() {
    }

    public Alumno(Asignatura as1, Asignatura as2, Asignatura as3) {
        this.as1 = as1;
        this.as2 = as2;
        this.as3 = as3;
    }

    public Alumno(int idAsignatura1, int idAsignatura2, int idAsignatura3) {
        this.as1 = new Asignatura(idAsignatura1);
        this.as2 = new Asignatura(idAsignatura2);
        this.as3 = new Asignatura(idAsignatura3);
        /*
En el contexto de la clase Alumno, el constructor public Alumno(int idAsignatura1,
 int idAsignatura2, int idAsignatura3) es utilizado para crear instancias de la
  clase Alumno y sus asignaturas asociadas.

Cuando se crea un nuevo objeto Alumno, es necesario proporcionar los identificadores
 de las asignaturas que el alumno está  cursando. Estos identificadores se utilizan
  para inicializar las asignaturas del alumno.

Dado que la clase Asignatura tiene un constructor que acepta un parámetro de tipo
int (el identificador de la asignatura), podemos usarlo para crear objetos de
asignatura con identificadores específicos.

Por lo tanto, en el constructor de Alumno, se utiliza el constructor de Asignatura
con un parámetro de identificador (new Asignatura(idAsignatura1)),
 new Asignatura(idAsignatura2), new Asignatura(idAsignatura3)) para crear instancias
de asignatura con los identificadores proporcionados. Esto nos permite inicializar
las asignaturas del alumno con los identificadores específicos que se pasan al
constructor de Alumno.*/
    }

    public Asignatura getAs1() {
        return as1;
    }

    public Asignatura getAs2() {
        return as2;
    }

    public Asignatura getAs3() {
        return as3;
    }
}


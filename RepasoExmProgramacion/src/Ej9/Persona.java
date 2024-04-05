package Ej9;

public class Persona {
    public String nombre, apellido, dni;

    public int edad, altura;
    public double peso;
    public static double calcularIMC(double peso, double altura ) {

        return peso / (altura * altura);
    }

}

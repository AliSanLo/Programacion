package reto5; // Declaración del paquete (si es necesario)

import java.util.Scanner;
import java.util.Calendar;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e introducir datos
        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        int month = scanner.nextInt();

        // Crear una instancia de Calendar 
        Calendar calendar = Calendar.getInstance();
        //introducir en la instancia el año y mes
        calendar.set(year, month - 1, 1); 
        //Se resta 1 porque el mes en Calendar va de 0 a 11

        System.out.println("  D    L    M    X    J    V    S");
        
        
        int primerDiaSemana = calendar.get(Calendar.DAY_OF_WEEK); //corresponed al día de la semana del primer día del mes.
        //primerDiaSemana tiene un numero del 1 al 7 que representa el dia de la semana
        
        int ultimoDiaMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); //para saber hasta dónde imprimir

        // Imprimos espacios en blanco hasta el primer día del mes
        for (int i = 1; i < primerDiaSemana; i++) {
            System.out.print("     ");
        }

        // Imprimimos los días del mes
        for (int dia = 1; dia <= ultimoDiaMes; dia++) {
            System.out.printf("%3d", dia);
            //%3d indica que el número  ocupa al menos 3 espacios, y agregara si es necesario  espacios en blanco a la izquierda para lograr esa longitud.
            //el formato afectara a la varaibel dia
            
            // Ponemos cada semana en una linea nueva. Para en el ultimo dia del mes
            if ((dia + primerDiaSemana - 1) % 7 == 0 || dia == ultimoDiaMes) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}

package Recursividad;

public class Principal {

	public class Main {



	    public static void main(String[] args) {
	        //Sumar los números naturales hasta N de forma recursiva
	        int n = 5; //15
	        int resultado = sumaRecursiva(n);
	        System.out.println(resultado); //15
	    }

	    static int sumaRecursiva(int numero){
	        int res;
	        //Caso base
	        if(numero == 1){
	            res = 1;
	        }else{ //Caso recursivo
	            res = numero + sumaRecursiva(numero-1);
	        }
	        return res;
	    }
	}}

	
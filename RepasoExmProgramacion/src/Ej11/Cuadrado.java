package Ej11;

public class Cuadrado {
    public int base, altura;

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado() {
    }
    public int areaCuadrado (){
        int areaCuadrado= base*altura;
        return areaCuadrado();
    }
    public int perimetroCuadrado(){
        int perimetroCuadrado = (2*altura)+(2*altura);
        return perimetroCuadrado;
    }

}

package Ej11;

public class Triangulo {
    public int base;
    public int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int areaTriangulo(){
        int area =(base*altura)/2;
        return area;
    }
}

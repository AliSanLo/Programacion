package Ej11;

public class Circulo {
    public double radio;
    public double diametro;
    public double area;

    public Circulo(double radio, double diametro, double area) {
        this.radio = radio;
        this.diametro = diametro;
        this.area = area;
    }

    public Circulo() {
    }

    public double areaCirculo() {
        double area = 3.14 * (radio * radio);
        return area;
    }

    public double diametroCirculo() {
        double diametro = 2 * radio;
        return diametro;
    }

}

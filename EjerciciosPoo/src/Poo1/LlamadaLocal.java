package Poo1;

public class LlamadaLocal {
    public long numeroOrigen;
   public  long numeroDestino;
    public double coste = 0.15;
    public double duracion;

    //Se calculará automáticamente el coste teniendo en cuenta que el coste de cada segundo es de 0,15 más un establecimiento de llamada de 0,50
    public LlamadaLocal(long numeroOrigen, long numeroDestino, double coste, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.coste = coste;
        this.duracion = duracion;


    }

    public LlamadaLocal() {

    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void mostrarDatos(){
        //TERMINAR
    }
}

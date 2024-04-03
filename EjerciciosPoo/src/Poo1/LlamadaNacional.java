package Poo1;

public class LlamadaNacional extends LlamadaLocal {
    char destino;

    public LlamadaNacional(char destino, long numeroOrigen, long numeroDestino, double coste, double duracion) {
        super(numeroOrigen, numeroDestino, coste, duracion);
        this.destino = destino;
    }


    public void calcularCoste(){
    if (destino == 'a') {
        coste = 0.40;
    }
    if (destino == 'b') {
        coste = 0.50;
    }
    if (destino == 'c') {
        coste = 0.70;
    }
    setCoste(coste);
    //System.out.println(coste);
}
}


package Esercizio2;

public class DettagliSim {
    public static void main(String[] args){
        Chiamata[] chiamate = new Chiamata[5];
        chiamate[0] = new Chiamata("3332222222",5);

        CartaSim sim1 = new CartaSim("3511231234", 5, chiamate );
    }
}

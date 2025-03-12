package Esercizio2;

public class CartaSim {
    private String numeroTelefono;
    private float credito;
    private Chiamata[] chiamate = new Chiamata[5];

    public CartaSim(String numeroTelefono, float credito, Chiamata[] chiamate){
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.chiamate = chiamate;
    }
}

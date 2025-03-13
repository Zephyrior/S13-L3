package Esercizio2;

public class CartaSim {
    private String numeroTelefono;
    private float credito = 0;
    private Chiamata[] chiamate = new Chiamata[5];

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public CartaSim(String numeroTelefono, float credito, Chiamata[] chiamate){
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.chiamate = chiamate;
    }

    public CartaSim(){};
}

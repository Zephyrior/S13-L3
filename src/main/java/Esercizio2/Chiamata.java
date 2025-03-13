package Esercizio2;

public class Chiamata {
    private String chiamata;
    private int durata;


    public String getChiamata() {
        return chiamata;
    }

    public void setChiamata(String chiamata) {
        this.chiamata = chiamata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public Chiamata(String chiamata, int durata){
        this.chiamata = chiamata;
        this.durata = durata;
    }

    public Chiamata(){};
}

package Esercizio1;

public class RettangoloClass {
    private double altezza;
    private double base;

    public RettangoloClass(double altezza, double base){
        this.altezza = altezza;
        this.base = base;
    }
    public double calcoloPerimetro(){
        return 2*(altezza+base);
    }
    public double calcoloArea(){
        return altezza*base;
    }
}

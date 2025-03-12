package Esercizio1;

public class PerimetroRettangolo {
    public static void main(String[] args) {
    RettangoloClass rettangolo1 = new RettangoloClass(10, 5);
    RettangoloClass rettangolo2 = new RettangoloClass(5, 10);

    StampaRisultati.stampaRettangolo(rettangolo1);
    StampaRisultati.stampaSomma(rettangolo1,rettangolo2);

//    double perimetro1 = rettangolo1.calcoloPerimetro();
//    double perimetro2 = rettangolo2.calcoloPerimetro();
//
//    double area1 = rettangolo1.calcoloArea();
//    double area2 = rettangolo2.calcoloArea();
//
//        System.out.println("Il perimetro del primo rettangolo è:"+ perimetro1);
//        System.out.println("Il perimetro del secondo rettangolo è"+ perimetro2);
//
//        System.out.println("L'area del primo rettangolo è:"+area1);
//        System.out.println("L'area del secondo rettangolo è" +area2);
    }
}

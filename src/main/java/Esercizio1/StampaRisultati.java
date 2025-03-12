package Esercizio1;

public class StampaRisultati {
    public static void stampaRettangolo(RettangoloClass rettangolo){
        System.out.println("L'area del rettangolo è:" + rettangolo.calcoloArea());
        System.out.println("Il perimetro del rettangolo è:" + rettangolo.calcoloPerimetro());
    }
    public static void stampaSomma(RettangoloClass rettangolo1, RettangoloClass rettangolo2){
        System.out.println("L'area del primo rettangolo è:"+ rettangolo1.calcoloArea());
        System.out.println("L'area del secondo rettangolo è:"+ rettangolo2.calcoloArea());
        System.out.println("La somma delle aree è:"+ (rettangolo1.calcoloArea()+rettangolo2.calcoloArea()));

        System.out.println("Il perimetro del primo rettangolo è:"+ rettangolo1.calcoloPerimetro());
        System.out.println("Il perimetro del secondo rettangolo è:"+rettangolo2.calcoloPerimetro());
        System.out.println("La somma dei perimetri è:"+ (rettangolo1.calcoloPerimetro()+rettangolo2.calcoloPerimetro()));
    }
}

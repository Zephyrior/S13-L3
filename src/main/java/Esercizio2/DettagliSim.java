package Esercizio2;

public class DettagliSim {

    public static void stampaSim(CartaSim sim){
        System.out.println("Dettagli sim:");
        System.out.println("Numero sim: " + sim.getNumeroTelefono());
        System.out.println("Credito sim: " + sim.getCredito() + " €");
        System.out.println("Elenco chiamate:");
        for (int i = 0; i < sim.getChiamate().length; i++){
            Chiamata corrente = sim.getChiamate()[i];
            if(corrente!=null){
                System.out.println("numero: " + corrente.getChiamata() + " - durata: " + corrente.getDurata() + " mins.");
            }
        }
    }
    public static void main(String[] args){
        Chiamata[] chiamate = new Chiamata[5];
        CartaSim sim1 = new CartaSim("3511231234", 5, chiamate );
        Chiamata c1 = new Chiamata("3332222222",5);
        Chiamata c2 = new Chiamata("3332222222",3);
        Chiamata c3 = new Chiamata("3332222222",12);
        Chiamata c4 = new Chiamata("3332222222",9);

        sim1.getChiamate()[0] = c1;
        sim1.getChiamate()[1] = c2;
        sim1.getChiamate()[2] = c3;
        sim1.getChiamate()[3] = c4;

        stampaSim(sim1);
    }
}

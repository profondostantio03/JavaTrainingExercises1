package produzioneVeicolo;
import meccanicaVeicolo.Veicolo;

public class Automobile extends Veicolo{
    private int nPorte;

    public Automobile(String modello, int cilindrata, int nPorte){
        super(modello, cilindrata);
        this.nPorte = nPorte;
    }

    @Override
    public void avvia(){
        System.out.println("Motore avviato");
        avviaMotore();
    }
}

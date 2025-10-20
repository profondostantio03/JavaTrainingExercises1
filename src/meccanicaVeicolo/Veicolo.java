package meccanicaVeicolo;

public class Veicolo{
    private String modello;
    protected Motore motore;

    public Veicolo(String modello, int cilindrata){
        this.modello = modello;
        this.motore = new Motore(cilindrata);
    }

    public final void avviaMotore(){
        motore.accendi();
    }

    public void avvia(){
        System.out.println(modello + ": avvio");
        motore.accendi();
    }

    public String getModello(){
        return modello;
    }
}

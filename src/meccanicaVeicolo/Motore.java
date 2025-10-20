package meccanicaVeicolo;

class Motore{
    private int cilindrata;

    Motore(int cilindrata){
        this.cilindrata = cilindrata;
    }

    void accendi(){
        System.out.println("Motore (" + cilindrata + "cc) acceso.");
    }

    int getCilindrata(){
        return cilindrata;
    }
}
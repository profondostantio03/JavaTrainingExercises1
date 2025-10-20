package produzioneVeicolo;

import meccanicaVeicolo.Veicolo;

public class Main{
    public static void main(String[] args){
        System.out.println("Test automobile");
        Automobile miaAuto = new Automobile("Fiat Panda", 1200, 5);
        miaAuto.avvia();

        System.out.println("Test veicolo");
        Veicolo trattore = new Veicolo("Trattore", 4100);
        trattore.avvia();

        System.out.println("Test polimorfismo");
        Veicolo autoSportiva = new Veicolo("Ferrari", 3700);
        autoSportiva.avvia();
    }
}
package Purse;

public class Coin {

    private String nome;
    private double valore;

    public Coin(String nome, double valore){
        this.nome = nome;
        this.valore = valore;
    }

    public String getNome(){
        return nome;
    }

    public double getValore(){
        return valore;
    }

    public String toString(){
        return nome + " (" + valore + "euro)";
    }

}

package com.company;

public abstract class Bil {
    protected String regNr;
    protected String mærke;
    protected String model;
    protected int årgang;
    protected int antalDøre;

    public Bil(String mærke, String model, int årgang, int antalDøre, String regNr){
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
        this.regNr = regNr;
    }

    public String getMærke() {return mærke;}
    public String getModel() {return model;}
    public int getÅrgang() {return årgang;}
    public int getAntalDøre() {return antalDøre;}
    public String getRegNr() {return regNr;}
    public void setAntalDøre(int antalDøre) {this.antalDøre = antalDøre;}
    public void setMærke(String mærke) {this.mærke = mærke;}
    public void setModel(String model) {this.model = model;}
    public void setRegNr(String regNr) {this.regNr = regNr;}
    public void setÅrgang(int årgang) {this.årgang = årgang;}

    public abstract double beregnGrønEjerAfgift();

    @Override
    public String toString() {
        return "bil " +
                "mærke: " + mærke + ", " +
                "model: " + model + ", " +
                "årgang: " + årgang + ", " +
                "antalDøre: " + antalDøre + ", " +
                "regNr: " + regNr + ", ";
    }
}

package com.company;

public class ElBil extends Bil{
    private double batKwh;
    private int maxKm;
    private double kWhPr100Km;
    private double omregnWhTilWKm = 91.25;
    private double omregnWKmPerL = 100;


    public ElBil(String mærke, String model, int årgang, int antalDøre, String regNr, double wattTimerPrKm){
        super(mærke, model, årgang, antalDøre, regNr);
        this.batKwh = batKwh;
        this.maxKm = maxKm;
        this.kWhPr100Km = kWhPr100Km;
    }

    public double getBatKwh() {return batKwh;}
    public double getWattTimerPrKm() {return kWhPr100Km;}
    public int getMaxKm() {return maxKm;}

    @Override
    public double beregnGrønEjerAfgift() {

        double step1 = kWhPr100Km;
        double step2 = step1 / 91.25;
        double kmPerL = step2 / 100;


        double ejerAfgift = 0;
        if (kmPerL <= 50 && kmPerL > 20){
            ejerAfgift = 330;
        } else if (kmPerL <= 20 && kmPerL > 15){
            ejerAfgift = 1050;
        } else if (kmPerL <= 15 && kmPerL > 10){
            ejerAfgift = 2340;
        } else if (kmPerL <= 10 && kmPerL > 5){
            ejerAfgift = 5500;
        } else if (kmPerL <= 5) {
            ejerAfgift = 10470;
        }
        return ejerAfgift;
    }

    @Override
    public String toString(){
        return super.toString() + "grøn ejer afgift: " + beregnGrønEjerAfgift() + "kr\n";
    }
}

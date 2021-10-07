package com.company;

public class DiselBil extends Bil{
    private boolean harPartikkelFilter;
    private double kmPerL;

    public DiselBil(String mærke, String model, int årgang, int antalDøre, String regNr, double kmPerL){
        super(mærke, model, årgang, antalDøre, regNr);
        this.harPartikkelFilter = harPartikkelFilter;
        this.kmPerL = kmPerL;
    }

    public boolean isHarPartikkelFilter() {return harPartikkelFilter;}
    public double getKmPerL() {return kmPerL;}

    @Override
    public double beregnGrønEjerAfgift() {

        double udligningsafgift1 = 130;
        double udligningsafgift2 = 1390;
        double udligningsafgift3 = 1850;
        double udligningsafgift4 = 2770;
        double udligningsafgift5 = 15260;

        double ejerAfgift = 0;
        if (kmPerL <= 50 && kmPerL > 20){
            ejerAfgift = 330 + udligningsafgift1;
        } else if (kmPerL <= 20 && kmPerL > 15){
            ejerAfgift = 1050 + udligningsafgift2;
        } else if (kmPerL <= 15 && kmPerL > 10){
            ejerAfgift = 2340 + udligningsafgift3;
        } else if (kmPerL <= 10 && kmPerL > 5){
            ejerAfgift = 5500 + udligningsafgift4;
        } else if (kmPerL <= 5) {
            ejerAfgift = 10470 + udligningsafgift5;
        }
        if (harPartikkelFilter == false) {
            ejerAfgift += 1000;
        }
        return ejerAfgift;
    }

    @Override
    public String toString(){
        return super.toString() + "grøn ejer afgift: " + beregnGrønEjerAfgift() + " kr\n";
    }
}

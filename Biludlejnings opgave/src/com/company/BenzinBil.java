package com.company;

public class BenzinBil extends Bil{
    private int oktantal;
    private double kmPerL;

    public BenzinBil(String mærke, String model, int årgang, int antalDøre, String regNr,
                     double kmPerL){
        super(mærke, model, årgang, antalDøre, regNr);
        this.oktantal = oktantal;
        this.kmPerL = kmPerL;
    }

    public double getKmPerL() {return kmPerL;}
    public int getOktantal() {return oktantal;}

    @Override
    public double beregnGrønEjerAfgift() {
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
        } else if (kmPerL > 50) {
            ejerAfgift = 100;
        }
        return ejerAfgift;
    }

    @Override
    public String toString(){
        return super.toString() + "grøn ejer afgift: " + beregnGrønEjerAfgift() + "kr\n";
    }
}

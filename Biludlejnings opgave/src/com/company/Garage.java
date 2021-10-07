package com.company;

import java.util.ArrayList;

public class Garage {

    BenzinBil benzinBil = new BenzinBil("vw", "sport", 2020, 5, "aj061021", 16);
    ElBil elBil = new ElBil("Tesla", "standart", 2020, 5, "aj21", 164);
    DiselBil diselBil = new DiselBil("Toyota", "Stationcar", 2020, 7, "021", 11);
    DiselBil diselBil2 = new DiselBil("t", "s", 2020, 7, "021", 11);

    ArrayList<Bil> bilListe = new ArrayList<>();

    public Garage(){
        //ArrayList<Bil> bilListe = new ArrayList<>();
        bilListe.add(benzinBil);
        bilListe.add(elBil);
        bilListe.add(diselBil);
        bilListe.add(diselBil2);

    }

    public double beregnGronAfgiftForBilpark(){
        double samledeEjerAfgift = 0;

            samledeEjerAfgift += benzinBil.beregnGrønEjerAfgift();
            samledeEjerAfgift += elBil.beregnGrønEjerAfgift();
            samledeEjerAfgift += diselBil.beregnGrønEjerAfgift();

        return samledeEjerAfgift;
    }

    @Override
    public String toString() {
        return "Cars in the garage: \n\n" +
                bilListe + "\n" +
                "samlede grøn afgift af alle bilerne: " + beregnGronAfgiftForBilpark();
    }

    /*@Override
    public String toString() {
        return "Cars in the garage: \n\n" +
                "Benzin biler: \n" + benzinBil + "\n" +
                "El biler: \n" + elBil + "\n" +
                "Disel biler: \n" + diselBil + "\n" +
                "samlede grøn afgift af alle bilerne: " + beregnGronAfgiftForBilpark();
    }*/
}

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Garage garage = new Garage();
        ArrayList<Bil> bilListe = new ArrayList<>();

        BenzinBil benzinBil = new BenzinBil("vw", "sport", 2020, 5, "aj061021", 16);
        ElBil elBil = new ElBil("Tesla", "standart", 2020, 5, "aj21", 164);
        DiselBil diselBil = new DiselBil("Toyota", "Stationcar", 2020, 7, "021", 11);
        DiselBil diselBil2 = new DiselBil("Toyota", "Stationcar", 2020, 7, "021", 11);
        bilListe.add(benzinBil);
        bilListe.add(elBil);
        bilListe.add(diselBil);
        bilListe.add(diselBil2);
        System.out.println(garage);


    }
}

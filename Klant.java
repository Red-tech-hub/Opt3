package com.company;

import java.util.ArrayList;


class Klant {
    Werknemer wordGeholpenDoor;

    public ArrayList<String> klant(int i) {
        ArrayList<String> klant = new ArrayList<String>();

        klant.add("Aaron");
        klant.add("Petra");
        klant.add("Harry");
        klant.add("Annabel");
        return klant;

    }

    public Integer review() {
        ArrayList<Integer> sterren = new ArrayList<Integer>();

        sterren.add(4);
        sterren.add(5);
        sterren.add(2);
        sterren.add(5);

        int gemiddelde = 0;

        //code smell dead code: een for loop is gebruikt i.p.v. ervoor een rij aan optellingen te maken in de code
        for (int i = 0; i < sterren.size(); i++) {
            gemiddelde += sterren.get(i);
        }
        return gemiddelde / sterren.size();
    }
}



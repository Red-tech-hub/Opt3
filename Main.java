package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

class Baas{
    private static ArrayList<Werknemer> werknemers;
    private static ArrayList<Veiligheidsmaatregelen> veiligheidsmaatregelens;


    public static void initialize(){
        werknemers = new ArrayList<>();
        veiligheidsmaatregelens = new ArrayList<>();
    }

    public Boolean Baas(){
            Veiligheidsmaatregelen veilig = new Veiligheidsmaatregelen();
            Werknemer werknemer = new Werknemer();
            if (veilig.handschoenen() > 1 && werknemer.urenAantal() <= 2){
                return true;
            }
            else if (veilig.handschoenen() > 2 && werknemer.urenAantal() <= 4){
                return true;
            }

            else if (veilig.handschoenen() > 3 && werknemer.urenAantal() <= 6){
            return true;
            }
             else{
            return false;
             }
        }

    }


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

    //code smell dead code: een for loop is gebruikt i.p.v. ervoor een rij aan optellingen te maken in de code
    public Integer review() {
        ArrayList<Integer> sterren = new ArrayList<Integer>();

        sterren.add(4);
        sterren.add(5);
        sterren.add(2);
        sterren.add(5);

        int gemiddelde = 0;
        for (int i = 0; i < sterren.size(); i++) {
            gemiddelde += sterren.get(i);
        }
        return gemiddelde / sterren.size();
    }
}

class Werknemer extends Baas {
    Klant klant = new Klant();

    public String namenlijst() {
        ArrayList<String> naam = new ArrayList<String>();
/* Code refactor bloaters Data Clumps: door de namen die binnen de arraylist toebehoren niet in de if en de else te zetten is er minder code nodig
   Code refactor change preventor Shotgun Surgery: dppr de namen die binnen de arraylist toebehoren nier in de if/else te zetten is een aanpassing sneller gedaan*/
        naam.add("Aaron");
        naam.add("Petra");
        naam.add("Harry");

        if (klant.review() < 4) {
            Collections.shuffle(naam);
            return naam.get(0);
        } else {
            naam.add("Annabel");
            Collections.shuffle(naam);
            return naam.get(0);
        }
    }

    public Integer urenAantal() {
        ArrayList<Integer> uur = new ArrayList<Integer>();

        uur.add(1);
        uur.add(2);
        uur.add(3);
        uur.add(4);
        uur.add(5);

        if (klant.review() < 4) {
            Collections.shuffle(uur);
            return uur.get(0);
        } else {
            uur.add(4);
            Collections.shuffle(uur);
            return uur.get(0);
        }

    }

    public ArrayList<Integer> leeftijd() {

        ArrayList<Integer> leeftijd = new ArrayList<Integer>();

        leeftijd.add(14);
        leeftijd.add(15);
        leeftijd.add(16);
        leeftijd.add(17);
        leeftijd.add(18);
        leeftijd.add(19);
        leeftijd.add(20);
        leeftijd.add(21);

        if (namenlijst().equals("Aaron")) {
            leeftijd.get(4);
        }

        if (namenlijst().equals("Petra")) {
            leeftijd.get(1);
        }

        if (namenlijst().equals("Harry")) {
            leeftijd.get(2);
        }

        if (namenlijst().equals("Annabel")) {
            leeftijd.get(7);
        }
        return leeftijd;

    }

    public String taak() {
        ArrayList<String> taak = new ArrayList<>();
        taak.add("Kassa");
        taak.add("Vulploeg");
        Collections.shuffle(taak);
        return taak.get(0);
    }

    public ArrayList<Double> uurloon() {
        ArrayList<Double> loon = new ArrayList<Double>();

        if (taak().equals("Kassa")) {
            ArrayList<Double> kassaLoon = new ArrayList<Double>();

            kassaLoon.add(4.00);
            kassaLoon.add(4.30);
            kassaLoon.add(4.80);
            kassaLoon.add(5.40);
            kassaLoon.add(6.60);

            if (namenlijst().equals("Aaron")) {
                kassaLoon.get(4);
            }

            if (namenlijst().equals("Petra")) {
                kassaLoon.get(1);
            }

            if (namenlijst().equals("Harry")) {
                kassaLoon.get(2);
            }

            if (namenlijst().equals("Annabel")) {
                kassaLoon.get(4);
            }


        }

        else if (taak().equals("Vulploeg")) {

            ArrayList<Double> vulLoon = new ArrayList<Double>();

            vulLoon.add(4.10);
            vulLoon.add(4.20);
            vulLoon.add(4.60);
            vulLoon.add(5.20);
            vulLoon.add(6.40);

        if (namenlijst().equals("Aaron")) {
            vulLoon.get(4);
        }

        if (namenlijst().equals("Petra")) {
            vulLoon.get(1);
        }

        if (namenlijst().equals("Harry")) {
            vulLoon.get(2);
        }

        if (namenlijst().equals("Annabel")) {
            vulLoon.get(4);
        }

        }

    }
}


class Veiligheidsmaatregelen extends Baas{


    Werknemer werknemer = new Werknemer();

    public Double maxAantalKlanten() {
        Double oppervlakte = 30.00;
        Double maxklant = oppervlakte / 10.00;
        return maxklant;

    }

    public Integer handschoenen(){
        int nieuw = 1;
        if (werknemer.urenAantal() == 2 || werknemer.urenAantal() == 3) {
            nieuw++;
            return nieuw;
        }
        if (werknemer.urenAantal() == 4 || werknemer.urenAantal() == 5){
            nieuw++;
            nieuw++;
            return nieuw;
        }
    }
}



package com.company;

import java.util.ArrayList;

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


//    public Integer aantalKlanten(){
//        Klant k = new Klant();
//        return k().size();
//}



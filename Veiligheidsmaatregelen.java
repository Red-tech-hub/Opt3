package com.company;


//    public Integer aantalKlanten(){
//        Klant k = new Klant();
//        return k().size();
//}


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



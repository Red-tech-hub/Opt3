package com.company;

import org.junit.Assert;
import org.junit.Test;

class test {
    @Test
    public static void correlatieTest(){
        Veiligheidsmaatregelen v = new Veiligheidsmaatregelen();
        Werknemer w = new Werknemer();
        Assert.assertEquals(java.util.Optional.of(3), v.maxAantalKlanten());
        if(w.urenAantal() <2){
            Assert.assertEquals(java.util.Optional.of(1), v.handschoenen());
        }
        if(w.urenAantal() >= 3 || w.urenAantal() <=4){
            Assert.assertEquals(java.util.Optional.of(2), v.handschoenen());
        }
        if(w.urenAantal() > 5){
            Assert.assertEquals(java.util.Optional.of(2), v.handschoenen());
        }
    }

}

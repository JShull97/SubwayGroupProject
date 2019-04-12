/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlene
 */
public class TypeOfBread {
 
 private String italian;
 private String wholeWheat;
 private String honeyOat;
 private String italianHerbandCheese;

    public TypeOfBread(String italian, String wholeWheat, String honeyOat, 
            String italianHerbandCheese) {
        this.honeyOat = honeyOat;
        this.italian = italian;
        this.italianHerbandCheese = italianHerbandCheese;
        this.wholeWheat = wholeWheat;
    }//end of typeofbread method

    public String getItalian() {
        return italian;
    }

    public String getWholeWheat() {
        return wholeWheat;
    }

    public String getHoneyOat() {
        return honeyOat;
    }

    public String getItalianHerbandCheese() {
        return italianHerbandCheese;
    }
 
}//end of class

    


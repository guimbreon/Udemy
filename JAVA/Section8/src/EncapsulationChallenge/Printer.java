package EncapsulationChallenge;

import java.lang.Math;

public class Printer {
    private int tonerLevel;
    private  int pagesPrinted;
    private  boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && this.tonerLevel <= 100) ? tonerLevel : -1 ;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }




    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        if(duplex){
            System.out.println("The printer is a duplex printer!");
            return (int) Math.ceil(pages / 2.0);
        }else{
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

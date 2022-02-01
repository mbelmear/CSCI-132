package Outlab1;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Player {

    public String name;
    int numBats;
    int numBase;
    int numHits;
    int numAttempts;

    public Player(String name){
        this.name = name;
        this.numBats = 0;
        this.numBase = 0;
        this.numHits = 0;
        this.numAttempts = 0;
    }

    public String hit(){
        numHits++;
        numBase++;
        numBats++;
        numAttempts++;
        return this.name + " Comes to bat and gets a hit";
    }

    public String out(){
        numAttempts++;
        numBats++;
        return this.name + " Comes to bat and gets out";
    }

    public String error(){
        numAttempts++;
        numBats++;
        numBase++;
        return this.name + " Comes to bat and gets on base by a defensive error";
    }

    public String walk(){
        numBase++;
        numAttempts++;
        return this.name + " Comes to bat and gets four balls for a free pass";
    }

    public String getName(){
        return this.name;
    }

    public double getBA(){
        double battingAverage;
        battingAverage = (double) numHits/numBats;
        return battingAverage;

    }

    public double getOB(){
        double obpercent;
        obpercent = (double) numBase/numAttempts;
        return obpercent;
    }

    public String printInfo(){
        String output = this.name + "'s Batting average would be " + this.numHits + " out of " + this.numBats + " or " + getBA() +"\n"
                + this.name + "'s On Base Percent would be " + this.numBase + " out of " + this.numAttempts + " or " + getOB();
        return output;
    }

}


package Outlab3;

public class YahtzeeGame {
    //initialize fields to keep track of hands
    int numYahtzees;
    int numFullHouses;
    int numLargeStraights;
    int num4oak;
    int num3oak;
    int numLosers;
    Dice[] hand = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
    int[] numOcc = {0, 0, 0, 0, 0, 0};
    int numRolls;

    public YahtzeeGame() {
        this.numYahtzees = 0;
        this.numFullHouses = 0;
        this.numLargeStraights = 0;
        this.num4oak = 0;
        this.num3oak = 0;
        this.numLosers = 0;
        this.numRolls = 0;
    }

    public void play() {

        this.numRolls++; //increments number of rolls
        this.numOcc = new int[6]; //resets our occurrances array

        //rolls dice
        for (int i = 0; i < 5; i++) {
            this.hand[i].roll(); //gives dice value between 1 and 6
            //sets the number of occurrances array.
            //if our hand is [2, 4, 4, 4, 6],
            //numOcc will be [0, 1, 0, 3, 0, 1]
            for (int j = 0; j < 6; j++) {
                if (this.hand[i].getValue() == j + 1) {
                    this.numOcc[j]++;
                }
            }
        }
        // increment what the result of the hand is
        if (check3oak()) {
            this.num3oak++;
        } else if (check4oak()) {
            this.num4oak++;
        } else if (checkFullHouse()) {
            this.numFullHouses++;
        } else if (checkLargeStraight()) {
            this.numLargeStraights++;
        } else if (checkYahtzee()) {
            this.numYahtzees++;
        } else {
            this.numLosers++;
        }
// //test what the hand is
//        for(int i = 0; i < 5; i++){
//            System.out.print(this.hand[i] + " ");
//        }

// //testing numOcc is right
//        for(int i = 0; i < 6; i++){
//            System.out.print(numOcc[i] + " ");
//        }
    }

    public boolean check3oak() {
        //Check if a number occurs 3 times, and no number occurs twice
        boolean twoOak = false;
        boolean threeOak = false;
        for (int i = 0; i < 6; i++) {
            if (this.numOcc[i] == 3)
                threeOak = true;
            if (this.numOcc[i] == 2)
                twoOak = true;
        }
        //don't return true if there's a two of a kind- then it's a full house
        return (threeOak && !twoOak);

    }

    public boolean check4oak() {
        //check if a number occurs 4 times.
        boolean fourOak = false;

        for (int i = 0; i < 6; i++) {
            if (this.numOcc[i] == 4)
                fourOak = true;
        }
        return fourOak;
    }

    public boolean checkLargeStraight() {
        //check if every all numbers rolled are different or only occur once
        boolean zero = this.numOcc[0] == 0 || this.numOcc[5] == 0;
        boolean Lstraight = true;
        for (int i = 1; i < 5; i++) {
            if (this.numOcc[i] != 1)
                Lstraight = false;
        }
        if (zero && Lstraight)
            return Lstraight;
        return false;
    }

    public boolean checkYahtzee() {
        //check if number occurs 5 times
        boolean yahtzee = false;
        for (int i = 0; i < 6; i++) {
            if (this.numOcc[i] == 5)
                yahtzee = true;
        }
        return yahtzee;
    }

    public boolean checkFullHouse() {
    //it's a full house if a number occurs twice and a number occurs 3 times.
        boolean twoOak = false;
        boolean threeOak = false;
        for (int i = 0; i < 6; i++) {
            if (numOcc[i] == 2)
                twoOak = true;
            if (numOcc[i] == 3)
                threeOak = true;
        }
        return (twoOak && threeOak);
    }

    //returns the percent
    public double getPercent(int num, int numRolls) {
        double input = ((double) num / (double) numRolls) * 100.00;
        double twodecs = Math.round(input*100.0)/100.0;
        return twodecs;
    }
    //formatted output
    public void printData() {
        System.out.println("Number of Rolls: " + this.numRolls);
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Number of Three of a Kind: " + this.num3oak);
        System.out.println("Percent: " + getPercent(this.num3oak, this.numRolls) + "%");
        System.out.println();
        System.out.println("Number of Four of a Kind: " + this.num4oak);
        System.out.println("Percent: " + getPercent(this.num4oak, this.numRolls) + "%");
        System.out.println();
        System.out.println("Number of Full Houses: " + this.numFullHouses);
        System.out.println("Percent: " + getPercent(this.numFullHouses, this.numRolls) + "%");
        System.out.println();
        System.out.println("Number of Large Straights: " + this.numLargeStraights);
        System.out.println("Percent: " + getPercent(this.numLargeStraights, this.numRolls) + "%");
        System.out.println();
        System.out.println("Number of Yahtzees: " + this.numYahtzees);
        System.out.println("Percent: " + getPercent(this.numYahtzees, this.numRolls) + "%");
        System.out.println();
        System.out.println("Number of Losers: " + this.numLosers);
        System.out.println("Percent: " + getPercent(this.numLosers, this.numRolls) + "%");


        System.out.println();
    }
}
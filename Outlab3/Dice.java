package Outlab3;

import java.util.Random;

public class Dice {

    private Random rand;
    private int value;

    public Dice() {
        this.rand = new Random();
    }

    public void roll() {

        this.value = rand.nextInt(6) + 1;
    }

    public int getValue(){
        return this.value;
    }
}
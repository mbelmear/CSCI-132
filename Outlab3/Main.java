package Outlab3;

public class Main {

    public static void main(String[] args)
    {
        int numRolls = 5000;
        System.out.println();
        YahtzeeGame game = new YahtzeeGame();
        for(int i = 0; i < numRolls; i++){
            game.play();
        }
        game.printData();
    }
}




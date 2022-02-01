package Outlab2;
import java.util.Random;
public class Game {
    private int marbles;
    private Human hPlayer;
    private Computer cPlayer;
    private Random rn;
    public Game(int difficulty){
        rn = new Random();
        marbles = rn.nextInt(91) + 10;
        System.out.println("Marbles left: " + marbles);
        difficulty = rn.nextInt(10)%2 + 1;
        System.out.println("Randomly selected difficulty: " + difficulty);
        cPlayer = new Computer(difficulty);
        hPlayer = new Human();
    }
    public void play(){
        int firstturn = rn.nextInt(2);
        int winner = 0;
        System.out.println("First turn: " + firstturn);
        if (firstturn == 0){
            cPlayer.move(marbles);
            marbles = marbles - cPlayer.getChoice();
        }
        show_current_status();
        while(marbles != 0){
            hPlayer.move();
            marbles = marbles - hPlayer.getChoice();
            show_current_status();
            if (marbles == 0)
                winner = 1;
            else{
                cPlayer.move(marbles);
                marbles = marbles - cPlayer.getChoice();
            }
            show_current_status();
        }
        if(winner == 1)
            System.out.println("Sorry, you have lost to the Computer:(");
        else
            System.out.println("Congratulations! You have beat the Computer!");
    }
    public void show_current_status(){
        System.out.println("Marbles left: " + marbles);
    }
}

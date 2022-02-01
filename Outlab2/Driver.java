package Outlab2;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        int level = 1;
        System.out.println("Welcome to the Game of Nim");
        Scanner input = new Scanner(System.in);
        System.out.println("Press any number to continue");
        level = input.nextInt();
        Game g = new Game(level);
        g.play();
        System.out.println("Thanks for playing!");
    }
}

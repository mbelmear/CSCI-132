package Outlab2;
import java.util.Random;
public class Computer {
    private int choice;
    private int mode;
    private Random rn;
    public Computer(int m){
        mode = m;
        choice = -1;
        rn = new Random();
    }
    public void move(int marblesleft){
        if (marblesleft == 1)
            choice = 1;
        else if (mode == 1)
            choice = rn.nextInt(marblesleft/2)+1;
        else{
            int n = 1, power = 0;
            while (n <= marblesleft){
                n = 2 * n;
            }
            if (marblesleft + 1 == n)
                choice = rn.nextInt(marblesleft/2)+1;
            else
                choice = marblesleft-n/2+1;
        }
        System.out.println("Computer chooses " + choice +"\n");
    }

    public int getChoice() {
        return choice;
    }
}

package lab5;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String user_input = scan.nextLine();
        StringSolver ss = new StringSolver(user_input);

        Boolean running = true;
        String option;

        while (running) {
            System.out.println("Press 1 to get the frequency of a character in your sentence.");
            System.out.println("Press 2 to get the number of words in your sentence.");
            System.out.println("Press 3 to remove the spaces in your sentence.");
            System.out.println("Press 4 to enter a new sentence.");
            System.out.println("Press 5 to exit.");
            option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Please input a Character:");
                    String inp = scan.nextLine();
                    System.out.println(ss.m1(inp));
                    break;
                case "2":
                    System.out.println(ss.m2());
                    break;
                case "3":
                    System.out.println(ss.m3());
                    break;
                case "4":
                    System.out.println("Enter a new sentence: ");
                    String newString = scan.nextLine();
                    ss.m4(newString);
                    break;
                case "5":
                    running = false;
                    break;

            } // END of switch

        } // END of while

    }
}

package lab7;

import java.util.Scanner;

public class EmployeeDriver {
    public static void menu()
    {
        System.out.println("Welcome to Employee orientation");
        System.out.println("Press 1 to add hourly employee.");
        System.out.println("Press 2 to add commissioned employee.");
        System.out.println("Press 3 to add commissioned plus base employee.");
        System.out.println("Press 4 to print Hourly employee information");
        System.out.println("Press 5 to print Commissioned employee information");
        System.out.println("Press 6 to print Commissioned plus Base employee information");
        System.out.println("Press 9 to exit");
    }
    public static void main(String[] args) {

        Hourly h = new Hourly();
        Commissioned c = new Commissioned();
        CommissionBase cb = new CommissionBase();

        Scanner console = new Scanner(System.in);
        int choice = 0;

        do{
            menu();
            choice = console.nextInt();

            System.out.println("********");


            switch(choice){
                case 1:
                    System.out.println("Creating Hourly Employee");
                    h = new Hourly("Homer",  "Simpson", 5.00, 24);
                    break;
                case 2:
                    System.out.println("Creating Commissioned Employee");
                    c = new Commissioned("Marge", "Simpson", .08, 20000);
                    break;
                case 3:
                    System.out.println("Commission plus Base Employee");
                    cb = new CommissionBase("Bart", "Simpson", .12, 120000, 1000);
                    break;
                case 4:
                    System.out.println(h);
                    break;
                case 5:
                    System.out.println(c);
                    break;
                case 6:
                    System.out.println(cb);
                    break;
            }
        }while(choice != 9);
    }
}
//create 3 other methods
//has 2 constuctors in each
//has the 2string method in each
//employee is the generic as each employee has a firstname, lastname, and id number

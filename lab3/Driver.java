package lab3;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Array:");
        MyArray m =new MyArray();
        m.printFunction();
        System.out.println();
        m.reverseprintFunction();
        System.out.println();
        System.out.println("Second Largest: " + m.getSecondLargest());
        System.out.println();
        System.out.format("The average is: " + m.average());
        System.out.println();
        System.out.println();
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        System.out.println(m.search(n));
        System.out.println();
        System.out.println("Histogram:");
        m.histogram();
        System.out.println();
        m.countOccurance();
    }
}

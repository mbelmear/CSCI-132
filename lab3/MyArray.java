package lab3;

import java.util.Random;

public class MyArray {
    Random rd = new Random();
    int[] arr = new int[10];
    private final int MAX = 11;

    public MyArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10) + 1;
        }
    }

    public void printFunction() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void reverseprintFunction() {
        System.out.println("Array in Reverse Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

    public int getSecondLargest() {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }

    public double average() {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        int average = total / arr.length;
        return average;
    }

    public String search(int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return "Located " + target + " at index " + i;

        }
        return "Not in Array";
    }

    public void histogram() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void countOccurance() {
        int total[] = new int [MAX];
        for (int i : arr) {
            total[i]++;
        }
        for (int i = 0; i <total.length; i++)
            System.out.print("The number" + " " + i + " " + "is in the array" + " " + total[i] + " " + "times." + "\r\n");
    }
}

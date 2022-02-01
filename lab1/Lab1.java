package lab1;

public class Lab1 {
    static void firstcall(int a) {

        if (a == 4) {
            System.out.println("Four");
        } else if (a == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Neither number");
        }
//
//        if (a == 4) System.out.println("Four");
//        else if (a == 2) System.out.println("Two");
//        else System.out.println("Neither number");
    }

    public static String secondcall(String b) {
        System.out.println(b);
        return "MSU";
    }

    public static void thirdcall() {
        for (int i = 0; i < 3; i++) System.out.println(i);
    }

    public static void main(String[] args) {
        firstcall(2);
        String answer = secondcall("Bobcats");
        firstcall(4);
        thirdcall();
        System.out.println("The last answer is: " + answer);


    }

}
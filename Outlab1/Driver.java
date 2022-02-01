package Outlab1;

public class Driver {
    public static void main(String[] args) {

        Player p1 = new Player("Michael");

        System.out.println(p1.hit());
        System.out.println(p1.out());
        System.out.println(p1.out());
        System.out.println(p1.error());
        System.out.println(p1.walk());
//        System.out.println(p1.hit());
        System.out.println();

        System.out.println(p1.printInfo());
    }
}
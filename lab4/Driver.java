package lab4;

public class Driver {
    public static void main(String[] args) {

        Person pOne = new Person("First");
        Person pTwo = new Person("Second");

        int a = 5;
        pOne = pTwo.changeName(pTwo, pOne, a);

        System.out.println(pOne.getName()); // 8
        System.out.println(a); // 9
        System.out.println(pTwo.getName()); // 10
        System.out.println(pOne.getName());
    }
}

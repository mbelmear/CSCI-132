package lab4;

public class Car {

    private String name;

    public Car(String n) {
        name = n;
    }

    public Car() {
        name = "Generic";
    }

    public String getName() {
        return name;
    }

    public void changeName(String x) {
        name = x;
    }

    public Car testQuestion(Garage one, Garage two, Car three) {
        Car four = two.getCar();
        four.changeName("Doc");
        one.setCar(four);
        System.out.println(one.getName()); // print statement four
        System.out.println(two.getName()); // print statement five
        System.out.println(four.getName()); // print statement six
        three.changeName("Mack");
        one.setCar(three);
        two = one;
        System.out.println(one.getName()); // print statement seven
        System.out.println(two.getName()); // print statement eight
        System.out.println(four.getName()); // print statement nine

        return two.getCar();
    }
}

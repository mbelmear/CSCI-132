package lab4;

public class Garage {
    Car vehicle;

    public Garage(Car t) {
        vehicle = t;
    }

    public Car getCar() {
        return vehicle;
    }

    public String getName() {
        return vehicle.getName();
    }

    public void setCar(Car x) {
        vehicle = x;
    }

    public void changeName(String x) {
        vehicle.changeName(x);
    }
}

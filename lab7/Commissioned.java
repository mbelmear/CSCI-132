package lab7;

public class Commissioned extends Employee {
    double rate;
    int gsales;

    Commissioned(String f, String l, double r, int s) {
        id = ++count;
        super.firstname = f;
        super.lastname = l;
        rate = r;
        gsales = s;
    }

    public Commissioned() {

    }
    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", rate=" + rate +
                ", grossSales=" + gsales +
                '}';
    }
}
//commission rate, gross sales
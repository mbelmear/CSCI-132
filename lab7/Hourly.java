package lab7;

public class Hourly extends Employee {
    double wage;
    int hours;

    Hourly(String f, String l, double w, int h)
    {
        id = ++count;
        super.firstname = f;
        super.lastname = l;
        wage = w;
        hours = h;

    }

    public Hourly() {


    }
    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
//wage, number of hours worked
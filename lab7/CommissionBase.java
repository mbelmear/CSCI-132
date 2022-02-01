package lab7;

public class CommissionBase extends Commissioned{
    int salary;
    CommissionBase(String f, String l, double r, int sales, int salary){
        id = ++count;
        super.firstname = f;
        super.lastname = l;
        rate = r;
        gsales = sales;
        this.salary = salary;
    }

    public CommissionBase() {
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
                ", salary=" + salary +
                '}';
    }
}
//should have everything a commissioned employee has plus a base salary

package lab7;

public class Employee {
    String firstname;
    String lastname;
    int id;
    static int count = 0;

    Employee(){
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}
//firstname, lastname, id number

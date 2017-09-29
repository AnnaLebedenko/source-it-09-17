package HomeWork_1;

/**
 * Created by ANNA on 26.09.2017.
 */
public class Employee extends Person {
    public float salary;
    public Employee(String name, float salary) {
        super(name);
        this.salary = salary;
    }
}

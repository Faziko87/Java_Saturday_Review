package week11_review.inheritanceTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId,"Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is working as Developer");
    }
}

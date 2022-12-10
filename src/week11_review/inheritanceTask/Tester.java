package week11_review.inheritanceTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working as "+getJobTitle());
    }

    public void smokeTesting(){
        System.out.println(getName()+ " is working on smoke testing");
    }
}

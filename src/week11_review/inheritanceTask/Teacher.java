package week11_review.inheritanceTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Teacher", salary);
    }
}

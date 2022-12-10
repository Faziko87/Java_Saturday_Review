package week11_review.inheritanceTask;
public class Person{

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            System.err.println("Name can not be empty or unknown");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Age can not be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields
            	restrictions for the fields:
            		name can not be empty
            		name can not be null
            		age can not be negative
            		age can not be zero

            Add a constructor to set all the fields
            	(Make sure all the restrictions are applied)

            Methods:
                eat()
                drink()
                sleep()
                toString()


    2. Create a sub-class of Person named Employee:

            Extra variables:
                employeeId (String), jobTitle, salary

            Encapsulate all the fields
            	restrictions for the fields:
            		job title can not be empty
            		job title can not be null
            		salary can not be negative
            		salary can not be zero
            		employee id can not start with the character '0'

            Add a constructor to set all the fields
            	(Make sure all the restrictions are applied)

            Methods:
                work()
                toString()


    3. Create a sub-class of Person named Student
            Extra variables:
                studentId, fieldOfStudy, schoolName, grade

            Encapsulate all the fields
            	restrictions:
            		fieldOfStudy can not

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
                toString()


    4. Create the following sub-classes of Employee and override the work method:

    		4.1 Tester:
    				additional methods:
    					smokeTesting()

    		4.2 Developer:
    				additional methods:
    					unitTesting()

		4.3 Teacher

		4.4 Janitor

	5. Create the following sub-classes of Student and override the study method

			5.1 GraduateStudent

			5.2 UnderGraduateStudent

			5.3 CydeoStudent
					Additional Variables:
						batchNum, groupName, progLanguage

						Encapsulate all the fields
							restrictions for the fields:
								batch number can not be zero or negative
								groupName can not be empty or null
								groupName can not start with a digit or special characters
								progLanguage must be set to one of the followings:
									{"Java", "Python", "JavaScript"}

					Override the toString method to make sure that batchNum, groupName, progLanguage are included when the object of CydeoStudent is printed


 */

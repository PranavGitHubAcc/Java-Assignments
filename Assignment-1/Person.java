
public class Person {

    private String name;
    private String gender;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println(this.name + " is a " + this.age + " year old " + this.gender + ".");
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setName("John");
        p1.setAge(20);
        p1.setGender("male");

        p2.setName("Mary");
        p2.setAge(25);
        p2.setGender("female");

        p3.setName("Susan");
        p3.setAge(12);
        p3.setGender("female");

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();

    }
}

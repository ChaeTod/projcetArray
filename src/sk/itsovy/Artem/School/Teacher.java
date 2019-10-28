package sk.itsovy.Artem.School;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
        System.out.println("I'm the constructor in Teacher");
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

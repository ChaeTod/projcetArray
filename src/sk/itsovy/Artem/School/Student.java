package sk.itsovy.Artem.School;

public class Student extends Person {
    private String group;

    public Student(String name, int age, String group){
        super(name, age);
        this.group = group;
        //System.out.println("I'm the constructor in Student");
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}


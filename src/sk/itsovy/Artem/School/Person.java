package sk.itsovy.Artem.School;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age){
        this.age = age;
        this.name = name;
        //System.out.println("I'm the constructor in Person");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

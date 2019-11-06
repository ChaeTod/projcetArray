package sk.itsovy.Artem.School;

public class Stuff extends Person{
    private int position;

    public Stuff(String name, int age, int position){
        super(name, age);
        this.position = position;
        //System.out.println("I'm the constructor in Stuff");
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}

package Interfaces;

public class Person implements Info{
    @Override
    public void showInfo() {
        System.out.println("Name is "+this.name);
    }
    public String name;

    public Person (String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }


}

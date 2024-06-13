package Jun;

import org.checkerframework.checker.units.qual.A;

public class Lesson24 {
    public static void main (String [] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        animal.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}

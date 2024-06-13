package Jun;

public class Dog extends Animal {
    public void bark (){
        System.out.println("собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void showName() {
        System.out.println(name);
    }
}

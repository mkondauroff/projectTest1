package Jun;

public class Lesson {
    public static void main (String [] args) {
        Human.description = "Nice";
        Human.getDescripton();
        Human h1 = new Human();


    }

    }
class Human {
    private String name;
    private int age;

    public static String description;

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge () {
        return age;
    }
    public void getInfo () {
        System.out.println(name+ ","+age);
    }

    public static void getDescripton () {
        System.out.println(description);
    }
}

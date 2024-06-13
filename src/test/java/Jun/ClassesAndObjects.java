package Jun;

// публичный класс может быть 1
public class ClassesAndObjects {
    public static void main (String [] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        String name = "Саша";
        person1.setNameAndAge("Роман", 60);
        person2.setNameAndAge(name, 45);

        person1.speak();
        person2.speak();

    }
}

// вспомогательные классы. Их может быть много
class Person {
    String name_1;
    int age_1;

    void setNameAndAge (String username, int userage) {
        name_1 = username;
        age_1 = userage;
    };

    void calculateYearsToRetirement_1 (){
        int years = 65-age_1;
        System.out.println("Кол-во лет до пенсии "+ years);
    }

    int calculateYearsToRetirement_2 () { // такой метод обязан возращать целое число в main метод
        int years = 65-age_1;
        return years; // возвращает и выходит из метода
    }


    void speak() { // void - тип возвращаемого значения. Возращают "ничего" в метод main
        for(int i = 0; i<3; i++){
            System.out.println("My name is "+name_1 +", мне "+age_1+ " лет");
        }
    }
        void sayHello () {
            System.out.println("Hello!");
        }
}
class Sets {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
}
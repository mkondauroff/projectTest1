package Jun;

// публичный класс может быть 1
public class ClassesAndObjectsInkapsGetterSetter {
    public static void main (String [] args) {
        Pers person1 = new Pers();
        person1.setName("w");
        person1.setAge(-1);
        System.out.println("Выводим значение в main  методе: "+person1.getName());
        System.out.println("Выводим значение в main  методе: "+person1.getAge());
    }
}

class Pers {
    private String name;
    private int age;

    public void setName(String userName) { // setter
        if (userName.isEmpty()) {
            System.out.println("Введено пустое имя");
        } else {
            name = userName;
        }
        }


    public String getName() { // getter
        return name;
    }

    public void setAge(int userAge) { // setter
      if (userAge<0)  {
          System.out.println("Возраст должен быть положительным");
      }   else {
          age = userAge;
      }
    }

    public int getAge() { // getter
        return age;
    }
}

// максимальн ограничивать поля в классах, так чтобы поля вдны только в пределах 1 класса, там где задекларированы. Через getter и setter
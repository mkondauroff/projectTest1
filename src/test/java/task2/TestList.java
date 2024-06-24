package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TestList {
    public static void main(String[] args) {

        Student st1 = new Student("Иванов Иван", 17, 4.50);
        Student st2 = new Student("Петров Петр", 18, 4.45);
        Student st3 = new Student("Сидоров Сидор", 19, 4.99);
        Student st4 = new Student("Васильев Вася", 20, 4.79);

        List<Student> student = new ArrayList<>();
        student.add(st1);
        student.add(st2);
        student.add(st3);
        student.add(st4);

        var x = student.stream()
                .filter(st -> st.getAge() > 18) // метод фильтрует по критериям, возращает true or false
                .collect(Collectors.toList());  // лист после фильтра


        var y = student.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());

        var z = student.stream()
                .map(Student::getName)
                .collect(Collectors.toList());


        System.out.println("Найти всех студентов старше 18 лет: " + x);
        System.out.println("Отсортировать этих студентов по их среднему баллу в порядке убывания: " + y);
        System.out.println("Получить список имён студентов: " + z);

    }


}

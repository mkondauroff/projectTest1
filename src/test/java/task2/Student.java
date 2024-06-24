package task2;

import java.util.Objects;

public class Student {

    private String name;

    private int age;

    private double grade;

    public Student(String nameOfStudent, int ageOfStudent, double averageGrade) {
        this.name = nameOfStudent;
        this.age = ageOfStudent;
        this.grade = averageGrade;
    }

    @Override
    public String toString() {
        return "Студент [Имя=" + name
                + ", Возраст=" + age
                + ", Средний балл =" + grade + "]";
    }

    public void setNameAndAgeAndGrade(String nameOfStudent, int ageOfStudent, double averageGrade) {
        name = nameOfStudent;
        age = ageOfStudent;
        grade = averageGrade;
    }


    // getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
    // setter


}

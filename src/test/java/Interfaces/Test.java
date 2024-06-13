package Interfaces;

public class Test {
    public static void main (String[] args) {
       Info info1 = new Animal(1);
       Info info2 = new Person("Max");

       outPutInfo(info1);
       outPutInfo(info2);
    }

    public static void outPutInfo(Info info) {
        info.showInfo();
    }
}

package Jun;

import java.util.Scanner;

public class inputScanner {
    public static void main (String[] args){

        // String S = new String("Объект в JAVA");

        Scanner scan = new Scanner(System.in); // new - новый объект класса сканнер
        System.out.println("Введите число");
        //String string = scan.nextLine();
        int myInt = scan.nextInt();
        System.out.println("Вы ввели " + myInt);



    }

}

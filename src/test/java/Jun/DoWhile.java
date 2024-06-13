package Jun;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DoWhile {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи 5");
        int value = scan.nextInt();
        while (value!=5) {
            System.out.println("Введи 5");
            value = scan.nextInt();
        }
        System.out.println("Вы ввели 5");
    }

    @Test
    public void main2 () {

        Scanner scan = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = scan.nextInt();
        } while (value!=5);

        System.out.println("Вы ввели 5");
    }
}

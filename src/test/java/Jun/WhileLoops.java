package Jun;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class WhileLoops {
    public static void main (String[] args) {
        boolean e = 5==5; // >, <, >=, <=
        System.out.println(e);

    }

    @Test
    void  qwerty_1 () {
        int value = 0;
        boolean t = value > 0;
        System.out.println(t);

    }

    @Test
    public void qwerty_2 () {
        int value = 0;
        while(value<5) {
            System.out.println("hello " +value);
            value = value+1;
        }


    }

}


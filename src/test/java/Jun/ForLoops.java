package Jun;

import org.junit.jupiter.api.Test;

public class ForLoops {
    public static void main (String[] args){
        for(int r = 0; r<=10; r++){ // i++ == i = i+1
            System.out.println("Цикл for " +r);
        }
    }

    @Test public void asdf () {
        for(int t = 10; t >=0; t--){
            System.out.println("Цикл for " +t);
        }
    }

}

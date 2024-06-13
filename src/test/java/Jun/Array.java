package Jun;

public class Array {
    public static void main (String [] args) {

        char character = 'a'; // примтивный тип данных
        String s = "строка"; // ссылочный тип данных

        int number = 10; // примтивный тип данных, кробока с числом [10]
        int [] numbers = new int[5]; // размер 5 numbers --> [массив] ссылочный тип данных
       // System.out.println(numbers[0]); // 0-4 (0 1 2 3 4)
        // numbers[0]=10;
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

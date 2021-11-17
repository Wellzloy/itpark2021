package lesson4;

public class ForRunner {
    public static void main(String[] args) {

        for (int counter =1;counter <= 100; counter++){

            int square = counter * counter;

            System.out.println ("Текущее значение счетчика:" + counter);
            System.out.println ("Текущее значение квадрата" + square);
        }
              System.out.println ("---------------");
    }
}

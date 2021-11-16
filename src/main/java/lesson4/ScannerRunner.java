package lesson4;
import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Предствьтесь");
        String userNeme = scanner.nextLine();
        System.out.println("Добро пожаловать, " + userNeme + ". Введите число для расчета:");
        int value = scanner.nextInt();
        System.out.println("Подтверждаем, что Вы ввели " + value);
    }
}

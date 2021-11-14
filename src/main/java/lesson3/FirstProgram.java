package lesson3;

public class FirstProgram {


    public static void main(String[] args) {
        double x, x1, x2, a = 30, b = 1000, c = 0;
        double diskriminant = b * 2 - 4 * a * c;

        System.out.println("Значение дискриминанта:");
        System.out.println(diskriminant);

        if (diskriminant > 0) {
            x1 = (-b + Math.sqrt(diskriminant)) / 2 * a;
            x2 = (-b - Math.sqrt(diskriminant)) / 2 * a;
            System.out.println("Уравнение имеет два корня:");
            System.out.println(x1);
            System.out.println(x2);

        } else if (diskriminant == 0) {
            x = -b / 2 * a;
            System.out.println("Уравнение имеет один корень:");
            System.out.println(x);

        } else {
            System.out.println("Уравнение не имеет корней");

        }
    }
}
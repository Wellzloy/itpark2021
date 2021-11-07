package lesson2;

public class FerstProgram {

    int arg1, arg2, arg3, arg4;

    public static void main(String[] args) {

        long summa = summa(3, 5);
        System.out.println(summa);

        long otherSumma = summa(5, 5);
        System.out.println(otherSumma);

        long yetAnotherSumma = summa(2, 18);
        System.out.println(yetAnotherSumma);

        long resultOfMinus = minus(2, 18);
        System.out.println(resultOfMinus);

        long result = multiplyAndSumma(5);
        System.out.println(result);

        long summaArguments = allArguments(12,78,54,21);
        System.out.println(summaArguments);


    }

    /**
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения двух чисел
     */
    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyAndSumma(int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        return result;
    }
    public static long allArguments(int arg1, int arg2, int arg3, int arg4) {
        int result = (arg1 * arg2 - arg3)/arg4;
        return result;
    }
}



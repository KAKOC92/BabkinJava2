import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите целое число 'a'");
        int a = console.nextInt();

        System.out.println("Введите целое число 'b'");
        int b = console.nextInt();

        int resultMax;
        if (a > b) {
            resultMax = a;
        } else {
            resultMax = b;
        }
        System.out.println("Наибольшее число " + resultMax);

        if (a == b) {
            System.out.println("Числа 'a' и 'b' равны");
        }

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;

        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            int division = a / b;
            System.out.println("Частное чисел a' и 'b' равно  " + division);
        }
        System.out.println("Сумма чисел 'a' и 'b' равна " + sum);
        System.out.println("Разница чисел 'a' и 'b' равна " + minus);
        System.out.println("Произведение чисел a' и 'b' равно  " + multiply);
    }
}

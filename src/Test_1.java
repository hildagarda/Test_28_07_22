import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();

        System.out.println("Введите второе число");
        double num2 = sc.nextDouble();

        System.out.println("Введите третье число");
        double num3 = sc.nextDouble();

        if (num1 < num3 & num1 < num2) {
            System.out.println("наименьшее из чисел:" + num1);
        } else if (num2 < num1 & num2 < num3) {
            System.out.println("наименьшее из чисел:" + num2);
        } else {
            System.out.println("наименьшее из чисел:" + num3);
        }
    }
}
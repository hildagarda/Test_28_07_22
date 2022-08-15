package Quiz;

import java.util.Scanner;

public class Game {

    public static void enter() {
        int x;
        String y = "\uD83E\uDD73";
        String z = "\uD83E\uDD7A";
        System.out.println("Угадайте случайное число от 1 до 10 за ТРИ попытки");
        System.out.println("Первая попытка: введите число...");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Вы ввели " + num1);
        x = RandomNum.generateRandomIntIntRange(0, 10);

        if (num1 == x) {
            System.out.println("Ура!!! Вы угадали, случайное число: " + x + " кому-то сегодня благоволит Фортуна "+ y);
        } else {
            System.out.println("Увы, Вы не угадали. Однако, не унывай, у тебя еще есть две попытки!");
        }

        System.out.println("Вторая попытка: введите число...");
        int num2 = sc.nextInt();
        System.out.println("Вы ввели " + num2);
        if (num2 == x) {
            System.out.println("Ура!!! Вы угадали, случайное число: <" + x +"> кому-то сегодня благоволит Фортуна "+ y);
        } else {
            System.out.println("Увы, Вы не угадали. Однако, не унывай, у тебя все еще есть ПОСЛЕДНИЙ шанс!");

            System.out.println("Третья попытка: введите число...");
            int num3 = sc.nextInt();
            System.out.println("Вы ввели " + num3);
            if (num3 == x) {
                System.out.println("Ура!!! Вы угадали, случайное число: <" + x +"> кому-то сегодня благоволит Фортуна "+ y);
            } else {
                System.out.println("Увы, Вы снова не угадали. Случайное число: <" + x + "> Сегодня Фортуна Вам не благоволит"+ z);
            }
        }
    }
}
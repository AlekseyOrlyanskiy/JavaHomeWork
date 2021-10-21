package com.pb.orlyanskiy.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo{public static void main(String[] args) {

    Random random = new Random();

    int x = random.nextInt(101); // Задуманное число.


    System.out.println("Угадайте задуманное число от 0 до 100.");
    System.out.println("Для выхода из программы введите - выход.");

    final int MAX_ATTEMPT = 100; // Допустимое количество попыток.
    int attempt = 0;           // Счетчик попыток.

    Scanner in = new Scanner(System.in);
    while (attempt < MAX_ATTEMPT) {
        attempt++;
        System.out.println("Попытка " + attempt + ":");
        String value = in.next();
        int y = Integer.parseInt(value);
        if (x > y) {
            System.out.println ("Угадываемое число больше");
        } else if (x < y) {
            System.out.println ("Угадываемое число меньше");
        }
        if (value.equals("exit")) {
            break;

        }
        if (x != y) {
            continue;
        }

        System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
        break;
    }

    System.out.println("Конец игры!");
}
}
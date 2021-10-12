package com.pb.orlyanskiy.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {


        System.out.print("Введите число: ");

        byte a = 0, b = 14, d = 15, e = 35, f = 36, g = 50, h = 51, j = 100;


        Scanner in = new Scanner(System.in);
        byte i = in.nextByte();

        if (i >= a && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (i >= d && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + d + " до " + e + "\n");
        } else if (i >= f && i <= g) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + f + " до " + g + "\n");
        } else if (i >= h && i <= j) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + h + " до " + j + "\n");
        } else if (i > j) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
        }
    }
}
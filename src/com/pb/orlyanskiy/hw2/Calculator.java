package com.pb.orlyanskiy.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int operand1;
        int operand2;
        String sign;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите operand1: ");
        operand1 = in.nextInt();
        System.out.print("Введите operand2: ");
        operand2 = in.nextInt();
        System.out.print("Введите sign: ");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.println("Ответ:" + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Ответ:" + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Ответ:" + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0)
                System.out.println("Ответ:" + (operand1 / operand2));
                else {
                    System.out.println("Ошибка деления");
                }
                break;
            default:
                System.out.println("Неверный символ: " +sign);
        }
    }
}
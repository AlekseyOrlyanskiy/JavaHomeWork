package com.pb.orlyanskiy.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
            //Записываем массив из 10 элементов
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 элемент массива: ");
        array [0] = scanner.nextInt();
        System.out.println("Введите 2 элемент массива: ");
        array [1] = scanner.nextInt();
        System.out.println("Введите 3 элемент массива: ");
        array [2] = scanner.nextInt();
        System.out.println("Введите 4 элемент массива: ");
        array [3] = scanner.nextInt();
        System.out.println("Введите 5 элемент массива: ");
        array [4] = scanner.nextInt();
        System.out.println("Введите 6 элемент массива: ");
        array [5] = scanner.nextInt();
        System.out.println("Введите 7 элемент массива: ");
        array [6] = scanner.nextInt();
        System.out.println("Введите 8 элемент массива: ");
        array [7] = scanner.nextInt();
        System.out.println("Введите 9 элемент массива: ");
        array [8] = scanner.nextInt();
        System.out.println("Введите 10 элемент массива: ");
        array [9] = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
            // Считаем и выводим сумму всех элементов массива
        int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }

            System.out.println("Сумма элементов массива:" +sum);

            // Считаем и выводим количетсво положительных элементов массива
        int count = 0;
            for (int i = 0; i < array.length; i++) {
                 if (array[i] > 0) {
                count++;
            }
        }
            System.out.println("В массиве " + count + " положительных элементов");
        //Используем сортировку пузырьком
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Сортировка пузырьком:" +Arrays.toString(array));
        }
        }



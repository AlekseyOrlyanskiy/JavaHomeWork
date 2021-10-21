package com.pb.orlyanskiy.hw3;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
            //Записываем массив из 10 элементов
        int[] array = new int[]{5, 6, 7, -7, -9, 2, 0, 11, -35, 5};
            for (int i : array) {
            //Выводим все элементы массива
            System.out.println("Элемент массива:" + i);
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



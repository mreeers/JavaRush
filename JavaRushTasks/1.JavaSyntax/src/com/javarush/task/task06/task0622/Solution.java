package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        //напишите тут ваш код
        /***
         * Заполнение массива с клавиатуры 5 элементов
         */
        int arrayX[] = new int[5];
        for (int i = 0; i < arrayX.length; i++) {
            arrayX[i] = Integer.parseInt(reader.readLine());
        }


        /***
         * Сортировка и вывод элементов
         */
        bublesort(arrayX);
        for (int i = 0; i < arrayX.length; i++) {
            System.out.println(arrayX[i]);
        }
    }
    /***
     * Сортировка позырьком
     */
    public static void bublesort(int[] arr){
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
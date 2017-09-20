package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arrayInt.length / 2; i++) {
            int j = arrayInt[i];
            arrayInt[i] = arrayInt[9 - i];
            arrayInt[9 - i] = j;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}


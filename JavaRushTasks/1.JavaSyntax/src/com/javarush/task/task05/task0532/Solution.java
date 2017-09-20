package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        int[] arrayX = new int[maximum];
        for (int i = 0; i < maximum; i++) {
            arrayX[i] = Integer.parseInt(reader.readLine());
        }

        maximum = arrayX[0];
        for (int i = 0; i < arrayX.length; i++) {
            if (maximum < arrayX[i]){
                maximum = arrayX[i];
            }
        }


        System.out.println(maximum);
    }
}

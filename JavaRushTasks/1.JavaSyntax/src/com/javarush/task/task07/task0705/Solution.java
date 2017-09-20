package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrBig = new int[20];
        int[] arrSmall1 = new int[10];
        int[] arrSmall2 = new int[10];
        int j = 0;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrBig.length; i++) {
            arrBig[i] = Integer.parseInt(bfr.readLine());
            if(arrBig.length/2-1 < i){
                arrSmall2[j] = arrBig[i];
                System.out.println(arrSmall2[j]);
                j++;
            }
            if(j==0)arrSmall1[i] = arrBig[i];
        }
    }
}

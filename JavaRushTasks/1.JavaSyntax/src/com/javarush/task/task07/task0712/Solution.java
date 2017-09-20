package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String min = list.get(0);
        String max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min.length()) min = list.get(i);
            if (list.get(i).length() > max.length()) max = list.get(i);
        }

        int maxIn = list.indexOf(max);
        int minIn = list.indexOf(min);

        if (minIn < maxIn) System.out.println(list.get(minIn));
        else System.out.println(list.get(maxIn));

    }
}

package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> x3List= new ArrayList<Integer>();
        ArrayList<Integer> x2List= new ArrayList<Integer>();
        ArrayList<Integer> otherList= new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            mainList.add(x);
            if (x % 3 == 0){
                x3List.add(x);
            }
            if (x % 2 == 0){
                x2List.add(x);
            }
            if (x % 3 != 0 && x % 2 != 0) {
                otherList.add(x);
            }
        }
        printList(x3List);
        printList(x2List);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

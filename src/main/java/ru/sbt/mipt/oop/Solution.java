package main.java.ru.sbt.mipt.oop;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

/**
 * Created by 11007122 on 13.12.2017.
 */
public class Solution {
    public static void  main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer type, val, min;

        //PriorityQueue<Integer> naturalNumbers = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> naturalNumbers = new ArrayList<>();

        for (Integer i = 0; i < n; i++) {
            type = in.nextInt();
            if (type == 1) { // Добавление элемента
                val = in.nextInt();
                naturalNumbers.add(val);

            } else if (type == 2) {// Удаление минимального
                min = Collections.min(naturalNumbers);
                naturalNumbers.remove(min);
                System.out.println(min);
                //System.out.println(naturalNumbers);
            } else {
                System.out.println("Wrong event type");
            }
        }

        //System.out.println(naturalNumbers);
    }
}

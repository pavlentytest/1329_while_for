package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int a = 100;

        while(a > 0) {
            System.out.println("123");
            a--;
        }

        do {
            // 1 раз выполнится всегда

        } while(a < 0);

        for(int i=0;i<100;i++) {
            System.out.println("i="+i);
        }

        int[] x,z = new int[5];
        int y[], p[] = new int[6];
        p[0] = 1;
        int[] s = {5,6,7,1};

        Random random = new Random();

        for(int i=0;i<s.length;i++){
         //   s[i] = (int)(Math.random()*10);
            s[i] = random.nextInt(100);
        }

        for(int i=0;i<s.length;i++) {
            System.out.print(s[i] + " ");
        }

        for(int j: s) System.out.println(j);

        System.out.println(Arrays.toString(s));


        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Hello");

        var l = 100; // 15 java
        int k = 100;

        int d = 5;

        if(a > 1000) {
            int dd = 0;
        }
            d = 6;

        int[][] g = new int[3][4];
        g[0][3] = 3;

        int[][] zz = { {4,5}, {6,9} };

        // 4 5
        // 6 9

        int[][] df = { {4,6,7}, {4,5}, {6,8,5,3,6}};
        for(int i=0;i<g.length;i++) {
            for(int j=0; j<g[i].length;j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }


    }
}

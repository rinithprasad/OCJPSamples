package com.samples.ocjp8.part1.five;

public class Loopy {
    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        for (int y:x) System.out.println(y + " 1 IIIIIII");
        for (int y=0,z=0; z<x.length ;z++) System.out.println(y + " 22222 ");

        int y=0;
        for (int z=0; z<x.length ;z++) {
            y=x[z];
            System.out.println(y + " 33333 ");
        }



    }
}

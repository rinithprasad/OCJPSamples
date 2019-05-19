package com.samples.ocjp8.part1.two;

class Adder {
    public int addThem(int x, int y){
        return x + y;
    }
    public double addThem(double x, double y){
        return x + y;
    }
}

public class TestAdder {
    public static void main(String[] args){
        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int result = a.addThem(b, c);
        double doubleResult = a.addThem(22.5, 9.3);
        System.out.println("int addThem = " + result + " and double addThem = " + doubleResult + ".");
    }
}

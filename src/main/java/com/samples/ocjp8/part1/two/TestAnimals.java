package com.samples.ocjp8.part1.two;

public class TestAnimals {
    public static void main (String[] args){
        Animal a = new Animal();
        Animal b = new Horse(); //Animal ref, horse object
        a.eat(); //Animal Version of eat
        b.eat(); //Horse Version of eat
    }
}

class Animal {
    public void eat(){
        System.out.println("Generic Animal eating Generically");
    }
}
class Horse extends Animal {
    public void eat(){
        System.out.println("Horse eating hay, oats, and horse treats");
    }
    public void buck() { }
}
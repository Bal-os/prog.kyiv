package com.prog.hiev;

import com.prog.hiev.Car;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat", 2);
        Cat cat2 = new Cat("kitty", 0.5, true, "blue", 0);

        cat1.incrementAge();

        System.out.println(cat1.getAge() > cat2.getAge());
        System.out.println(cat2);
    }
}
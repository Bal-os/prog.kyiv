package com.prog.kiev;

import com.prog.kiev.Triangle;

public class main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(2, 2,3);
        Triangle tr2 = new Triangle(5, 12,13);
        Triangle tr3 = new Triangle(40, 9,41);
        System.out.println(tr1);
        System.out.println(tr1.calculateSquare() );
        System.out.println(tr2);
        System.out.println(tr2.calculateSquare());
        System.out.println(tr3);
        System.out.println(tr3.calculateSquare());
    }
}

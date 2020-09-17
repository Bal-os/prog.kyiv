package com.prog.kiev;

public class vectorInit {
    public static void main(String[] args) {
        Vector3d v1 = new Vector3d(1, 2,3);
        Vector3d v2 = new Vector3d(3, 2,1);
        Vector3d v3 = new Vector3d(2, 3,1);
        System.out.println(v1);
        System.out.println(v1.scalarProduct(v2));
        System.out.println(v1.vectorProduct(v3));
        System.out.println(v1.vectorSum(v1));
    }
}

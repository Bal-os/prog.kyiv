package com.prog.kiev;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double scalarProduct(Vector3d other){
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3d vectorSum(Vector3d other){
        double x = this.x + other.x;
        double y = this.y + other.y;
        double z = this.z + other.y;
        return new Vector3d(x,y,z);
    }

    public Vector3d vectorProduct(Vector3d other){
        double x = this.y * other.z - this.z * other.y;
        double y = this.z * other.x - this.x * other.z;
        double z = this.x * other.y - this.y * other.x;
        return new Vector3d(x,y,z);
    }
}

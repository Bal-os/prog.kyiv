package com.prog.hiev;

class Car{
    String color;
    double weight;
    int year;
    private double velosity=0;

    public Car() {
        super();
    }

    Car(String color, double weight, int year) {
        this.color=color;
        this.weight=weight;
        this.year=year;
    }
    public void beep(){
        System.out.println("BEEP-BEEP!!!");
    }
    public void acceleration (double a){
        velosity=velosity+a;
    }
    public void deceleration(double b){
        if(velosity-b>=0) velosity=velosity-b;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velosity=" + velosity +
                '}';
    }

    Car repaintCar(Car a, String newcolor){
        a.color=newcolor;
        return a;
    }
}
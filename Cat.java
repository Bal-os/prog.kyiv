package com.prog.hiev;

public class Cat {
    private final String BALD = "bald";
    private int age;
    private double weight;
    private String name;
    private String color = BALD;
    private boolean bald = true;

    private String colorCheck(boolean bald, String color) {
        return (bald != true) ? color : BALD;
    }

    private int weightCheck(int weight){
        return (weight > 0.0) ? weight : Math.abs(weight);
    }

    private int ageCheck(int age){
        return (age >= 0) ? age : 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incrementAge() {
        age++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isВald() {
        return bald;
    }


    public void setВald(boolean bald) {
        this.bald = bald;
        color = colorCheck(bald, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", age=" + age +
                ", color=" + color +
                ", weight=" + color +
                ", is cat bald=" + bald +
                '}';
    }

    public Cat() {

    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Cat(String name, double weight, boolean bald) {
        this.name = name;
        this.weight = weight;
        this.bald = bald;
    }

    public Cat(String name, double weight, boolean bald, String color) {
        this.name = name;
        this.weight = weight;
        this.bald = bald;
        this.color = colorCheck(bald, color);
    }

    public Cat(String name, double weight, boolean bald, String color, int age) {
        this.name = name;
        this.weight = weight;
        this.bald = bald;
        this.color = colorCheck(bald, color);
        this.age = ageCheck(age);
    }

}

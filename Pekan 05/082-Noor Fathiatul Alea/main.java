package com.shape; // Package

import java.util.ArrayList; // Java API

// ABSTRACTION + ENCAPSULATION
abstract class Shape {

    private String name; // Encapsulation

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract Method
    abstract double area();
}

// INHERITANCE
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name); // super keyword
        this.length = length;
        this.width = width;
    }

    // POLYMORPHISM
    @Override
    double area() {
        return length * width;
    }

    // INNER CLASS
    class Info {
        void showInfo() {
            System.out.println("Rectangle has length and width.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>(); // Java API

        Rectangle r1 = new Rectangle("Rectangle", 10, 5);

        shapes.add(r1);

        for (Shape s : shapes) {
            System.out.println("Shape: " + s.getName());
            System.out.println("Area: " + s.area());
        }

        // Menggunakan Inner Class
        Rectangle.Info info = r1.new Info();
        info.showInfo();
    }
}

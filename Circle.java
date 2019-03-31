package com.epam.lesson7;

public class Circle extends Shape {

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + radius;
    }

    public Circle(String color, double radius) {
        super(color);
        validateRadius(radius);
        this.radius = radius;
    }

    private void validateRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle > Radius can't be <= 0");
        }
    }

    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    private double radius;
    public static int n = 0;

}

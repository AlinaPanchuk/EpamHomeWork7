package com.epam.lesson7;

public class Triangle extends Shape {

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a = " + a +
                ", b = " + b +
                ", c = " + c;
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        validateTriangle(a, b, c);
    }

    private void validateTriangle(double a, double b, double c) {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Triangle cannot be exist.");
        }
    }

    public double calcArea() {
        double halfPeriment = (this.a + this.b + this.c) / 2;
        return Math.sqrt(halfPeriment * (halfPeriment - this.a) * (halfPeriment - this.b) * (halfPeriment - this.c));
    }

    private double a;
    private double b;
    private double c;

}

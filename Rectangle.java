package com.epam.lesson7;

public class Rectangle extends Shape {
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width = " + width +
                ", height = " + height;
    }

    public double calcArea() {
        return this.height * this.width;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        validateRectangleParams(width, height);
        this.width = width;
        this.height = height;
    }

    private void validateRectangleParams(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Rectangle > Width or Height can't be <= 0");
        }
    }

    private double width;
    private double height;
}

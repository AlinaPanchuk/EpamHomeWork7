package com.epam.lesson7;

public class Shape {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ": color = " + color;
    }

    public Shape(String color) {
        this.color = color;
    }

    //public Shape(){}

    private String color;

    public double calcArea() {
        return 0.0;
    }

}

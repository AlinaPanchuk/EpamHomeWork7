package com.epam.lesson7;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[9];
        shape[0] = new Rectangle("black", 7, 7);
        shape[1] = new Rectangle("white", 7.8, 8);
        shape[2] = new Rectangle("yellow", 23, 1);
        shape[3] = new Rectangle("green", 0.5, 4);
        shape[4] = new Circle("red", 2);
        shape[5] = new Circle("yellow", 8);
        shape[6] = new Circle("brown", 1);
        shape[7] = new Triangle("black", 8, 2, 7);
        shape[8] = new Triangle("purple", 6, 5, 3);

        outputShape(shape);
        outputAllArea(shape);
        viewArrayWithDifferentArea(shape);

    }

    private static void viewArrayWithDifferentArea(Shape[] shape) {
        System.out.println("0 element - Rectangle area, 1 - element - Circle area, 2 - element - Triangle area : ");
        for (int i = 0; i < createArrayWithDifferentArea(shape).length; i++) {
            System.out.println("Area of " + i + " element in array = " + createArrayWithDifferentArea(shape)[i]);
        }
    }

    public static double[] createArrayWithDifferentArea(Shape[] shapes) {
        double[] array = new double[3];
        array[0] = rectangleArea(shapes);
        array[1] = circleArea(shapes);
        array[2] = triangleArea(shapes);
        return array;
    }

    public static double rectangleArea(Shape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            if ((shape[i]) instanceof Rectangle) {
                sum = sum + shape[i].calcArea();
            }
        }
        return sum;
    }

    public static double circleArea(Shape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            if ((shape[i]) instanceof Circle) {
                sum = sum + shape[i].calcArea();
            }
        }
        return sum;
    }

    public static double triangleArea(Shape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            if ((shape[i]) instanceof Triangle) {
                sum = sum + shape[i].calcArea();
            }
        }
        return sum;
    }

    public static double allArea(Shape[] shape) {
        double sum = 0;
        for (Shape shapes : shape) {
            sum = sum + shapes.calcArea();
        }
        return sum;
    }

    public static void outputAllArea(Shape[] shape) {
        System.out.println("All area for all shapes = " + allArea(shape));
    }

    private static void outputShape(Shape[] shape) {
        for (Shape shapes : shape) {
            System.out.print(shapes);
            System.out.println(", " + "area = " + shapes.calcArea());
        }
    }
}

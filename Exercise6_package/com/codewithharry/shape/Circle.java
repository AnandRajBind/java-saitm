package com.codewithharry.shape;


public class Circle extends Shape {
    public Circle(int dim1) {// Recatangle class constructor
        super(dim1, -1);
    }

    public double area() {
        return Math.PI * this.dim1 * this.dim2;
    }


}
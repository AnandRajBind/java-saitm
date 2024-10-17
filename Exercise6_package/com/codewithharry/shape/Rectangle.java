package com.codewithharry.shape;

public class Rectangle extends Shape {
    public Rectangle(int dim1, int dim2) {// Recatangle class constructor
        super(dim1, dim2);
    }
    public int area() {
        return this.dim1 * this.dim2;
    }
}





package com.codewithharry.shape;

import com.codewithharry.shape.Shape;

public class Sphere  extends Shape {
    public Sphere(int dim1, int dim2) {// Recatangle class constructor
        super(dim1, dim2);
    }

    public double area() {
        return 4 * Math.PI*this.dim1 * this.dim2;
    }
}
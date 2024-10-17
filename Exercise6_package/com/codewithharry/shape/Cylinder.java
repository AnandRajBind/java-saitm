package com.codewithharry.shape;

public class Cylinder extends Shape {
    public Cylinder(int dim1, int dim2) {// Recatangle class constructor
        super(dim1, dim2);
    }

    public double area() {
        return 2 * Math.PI * this.dim1 * (this.dim2 + this.dim1);

    }
}

package org.example;

import java.util.Objects;

public class Triangle extends Shape{

    public double base;
    public double height;
    public double hypotenuse;

    public Triangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double calculateShape() {
        return this.base + this.height + this.hypotenuse;
    }

    @Override
    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(getBase(), triangle.getBase()) == 0 && Double.compare(getHeight(), triangle.getHeight()) == 0 && Double.compare(getHypotenuse(), triangle.getHypotenuse()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBase(), getHeight(), getHypotenuse());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }


}

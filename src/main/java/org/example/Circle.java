package org.example;

import java.util.Objects;

public class Circle extends Shape{

    double radius;
    double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateShape() {
        return this.pi * this.radius * 2;
    }

    public double getRectanglePerimeter() {
        return calculateShape();
    }
    @Override
    public double calculateArea() {
        return this.pi * this.radius * this.radius;
    }

    public double getRectangleArea() {
        return calculateArea();
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return getClass() == circle.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getClass());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}

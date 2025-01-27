package org.example;

import java.util.Objects;

public class Rectangle extends Shape {
    int rectangleWidth;
    int rectangleHeight;

    public Rectangle(int rectangleHeight, int rectangleWidth) {
        this.rectangleHeight = rectangleHeight;
        this.rectangleWidth = rectangleWidth;
    }


    @Override
    public double calculateShape() {
        return 2 * (this.rectangleWidth + this.rectangleHeight);
    }

    public double getRectanglePerimeter() {
        return calculateShape();
    }
    @Override
    public double calculateArea() {
        return this.rectangleWidth * this.rectangleHeight;
    }

    public double getRectangleArea() {
        return calculateArea();
    }

    public int getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(int rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }

    public int getRectangleHeight() {
        return rectangleHeight;
    }

    public void setRectangleHeight(int rectangleHeight) {
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rectangleWidth=" + rectangleWidth +
                ", rectangleHeight=" + rectangleHeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getClass() == rectangle.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getClass());
    }


}

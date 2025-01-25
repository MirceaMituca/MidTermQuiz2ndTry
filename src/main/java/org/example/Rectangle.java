package org.example;

import java.util.Objects;

public class Rectangle {
    int rectangleWidth;
    int rectangleHeight;

    public Rectangle(int rectangleHeight, int rectangleWidth) {
        this.rectangleHeight = rectangleHeight;
        this.rectangleWidth = rectangleWidth;
    }

    private int calculateRectangleArea(){
        return this.rectangleWidth * this.rectangleHeight;
    }
    public int getRectangleArea() {
        return calculateRectangleArea();
    }

    private int calculateRectanglePerimeter(){
        return 2 * (this.rectangleWidth + this.rectangleHeight);
    }

    public int getRectanglePerimeter() {
        return calculateRectanglePerimeter();
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
        return rectangleWidth == rectangle.rectangleWidth && rectangleHeight == rectangle.rectangleHeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangleWidth, rectangleHeight);
    }
}

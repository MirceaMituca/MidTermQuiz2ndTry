package org.example;

import java.util.Objects;

public class Square extends Shape {
    int squareSide;

    public Square(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double calculateShape(){
        return squareSide * squareSide;
    }

    public double getSquarePerimeter() {
        return calculateShape();
    }

    @Override
    public double calculateArea(){
        return squareSide * 4;
    }
    public double getSquareArea() {
        return calculateArea();
    }

    public int getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return squareSide == square.squareSide;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(squareSide);
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareSide=" + squareSide +
                '}';
    }
}

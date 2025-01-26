package org.example;

import java.util.HashSet;
import java.util.Set;

public class ShapeAnalysis {
    Set<Shape> addedShapeValues = new HashSet<>();

    public void addShapes(Shape pickedShape) {
        if (addedShapeValues.contains(pickedShape)) {
            System.out.println("You already tried to add shape");
        } else {
            // Add the shape to the set
            addedShapeValues.add(pickedShape);
            System.out.println("Shape added successfully.");
        }
    }

    public double totalShapeArea(){
        double totalShapeArea = 0;
        for (Shape pickedShape : addedShapeValues) {
            totalShapeArea += pickedShape.calculateArea();
        }
        return totalShapeArea;
    }
    public double totalShapePerimeter(){
        double totalShapePerimeter = 0;
        for (Shape pickedShape : addedShapeValues) {
            totalShapePerimeter += pickedShape.calculateShape();
        }
        return totalShapePerimeter;
    }


}
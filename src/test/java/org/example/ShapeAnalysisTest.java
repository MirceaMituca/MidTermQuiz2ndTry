package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// (add all types of shapes,
// add duplicates,
// add single shape
// ADD pairs of shapes).


//    Shape square1 = new Square(5);
//    Shape square2 = new Square(7);
//    Shape triangle1 = new Triangle(7,7,7);
//    Shape rectangle1 = new Rectangle(5,9);
//    Shape circle1 = new Circle(7);
//    Shape circle2 = new Circle(9);
//
//    finalCalculation.addShapes(square1);
//    finalCalculation.addShapes(square2);
//    finalCalculation.addShapes(triangle1);
//    finalCalculation.addShapes(rectangle1);
//    finalCalculation.addShapes(circle1);
//    finalCalculation.addShapes(circle2);


class ShapeAnalysisTest {

    private final ShapeAnalysis shapeAnalysis = new ShapeAnalysis();

    @Test
    void addAllTypesOfShapes() {

        Shape square1 = new Square(2);
        Shape triangle1 = new Triangle(2,3,4);
        Shape rectangle1 = new Rectangle(2,3);
        Shape circle1 = new Circle(5);

        shapeAnalysis.addShapes(square1);
        shapeAnalysis.addShapes(triangle1);
        shapeAnalysis.addShapes(rectangle1);
        shapeAnalysis.addShapes(circle1);

        assertEquals(4,shapeAnalysis.addedShapeValues.size());
//        assertEquals(3,shapeAnalysis.addedShapeValues.size());
    }

    @Test
    void addDuplicateShapes() {


        Shape square1 = new Square(2);
        Shape square2 = new Square(5);

        shapeAnalysis.addShapes(square1);
        shapeAnalysis.addShapes(square2);


        assertEquals(1,shapeAnalysis.addedShapeValues.size());
}

    @Test
    void addSingleShapes() {

        Shape square1 = new Square(2);

        shapeAnalysis.addShapes(square1);


        assertEquals(1,shapeAnalysis.addedShapeValues.size());
    }

    @Test
    void addPairOfShapes() {

        Shape rectangle1 = new Rectangle(2,3);
        Shape circle1 = new Circle(5);

        shapeAnalysis.addShapes(rectangle1);
        shapeAnalysis.addShapes(circle1);

        assertEquals(2,shapeAnalysis.addedShapeValues.size());
    }
}
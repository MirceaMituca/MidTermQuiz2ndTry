package org.example;

//You need to design an application that allows the possibility to calculate the surface and perimeter for multiple types of shape: rectangle, square, circle and triangle.
//The tool should allow the possibility to add multiple shapes and calculate the total sum for perimeter and for surface.
//Also, the application should make sure that 2 similar shapes couldn’t be added to the drawing tool. In case 2 similar shapes are added, an appropriate message should be printed to console.
// Since you want to be sure that you provide a high quality implementation, unit tests are needed to prove the main functionalities described above, work correctly (add all types of shapes, add duplicates, add single shape and pairs of shapes).
//To deliver the work, just make a zip file and attached it to the answer.

public class App {


    public static void main(String[] args) {

        Rectangle form1 = new Rectangle(20, 30);
        System.out.println("The area for this form is " + form1.getRectangleArea() +
                " and the perimeter for it is " + form1.getRectanglePerimeter());


        Square form2 = new Square(35);
        System.out.println("The area for this form is " + form2.getSquareArea() +
                " and the perimeter for it is " + form2.getSquarePerimeter());


    }
}


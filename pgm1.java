package veeraj;
/*Develop a Java class to create an interface named shape that contains a method named printArea().
Provide three classes named Rectangle,Triangle and Circle such that each one of the classes
extends the interface Shape.
Each of the classes contains only the method printArea() that prints the area of the given area.
Define the Shape interface*/
interface Shape {
 void printArea();
}

//Rectangle class implementing Shape
class Rectangle implements Shape {
	double width;
	double length;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void printArea() {
     double area = width * length;
     System.out.println("Area of Rectangle: " + area);
 }
}

//Triangle class implementing Shape
class Triangle implements Shape {
	double base;
 	double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public void printArea() {
     double area = 0.5 * base * height;
     System.out.println("Area of Triangle: " + area);
 }
}

//Circle class implementing Shape
class Circle implements Shape {
	double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public void printArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}

//Main class to test the implementations
public class pgm1 {
 public static void main(String[] args) {
     Shape rectangle = new Rectangle(5, 10);
     Shape triangle = new Triangle(4, 6);
     Shape circle = new Circle(3);

     rectangle.printArea();  // Output: Area of Rectangle: 50.0
     triangle.printArea();   // Output: Area of Triangle: 12.0
     circle.printArea();     // Output: Area of Circle: 28.274333882308138
 }
}

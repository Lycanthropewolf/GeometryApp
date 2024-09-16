
package com;

import com.geometry.Circle;
import com.geometry.Rectangle;
import com.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());
    }
}
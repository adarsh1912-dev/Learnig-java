package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(50);
        Rectangle rec = new Rectangle(10,32);
        System.out.println("Area of Circle : " + (Math.PI*Math.pow(cir.getRadius(), 2)));
        System.out.println("Area of Rectangle : " + (rec.getLength()*rec.getBreadth()));
    }
}

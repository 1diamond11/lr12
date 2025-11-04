package org.example;

public class Main {
    public static void main(String[] args) {
        Square mySquare = new Square();
        Shape square = new Square();
        square.sayHello();

        Shape triangle = new Triangle();

        System.out.println("Фигура 1: " + triangle.getType());
        System.out.println("Фигура 2: " + square.getType());
    }
}

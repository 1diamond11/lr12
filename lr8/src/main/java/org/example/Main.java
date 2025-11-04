package org.example;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape square = new Square();

        System.out.println("Фигура 1: " + triangle.getType());
        System.out.println("Фигура 2: " + square.getType());
    }
}

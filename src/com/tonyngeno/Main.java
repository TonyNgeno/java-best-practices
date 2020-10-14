package com.tonyngeno;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> shapes = new ArrayList<>();

        Shape rectangle = new Rectangle();
        shapes.add(rectangle.toString());

        Shape square = new Square();
        shapes.add(square.toString());

        Shape sphere = new Sphere();
        shapes.add(sphere.toString());

        Shape cube = new Cube();
        shapes.add(cube.toString());

        Shape ellipse = new Ellipse();
        shapes.add(ellipse.toString());

        Shape circle = new Circle();
        shapes.add(circle.toString());

        Shape tetrahedron = new Tetrahedron();
        shapes.add(tetrahedron.toString());

        Shape triangle = new Triangle();
        shapes.add(triangle.toString());
    }
}

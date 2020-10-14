package com.tonyngeno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<String> shapes=new ArrayList<>();

        int option=1;

        System.out.println("Find Area of Shapes Here....");
        while(option !=0) {
            System.out.println();
            option=scanner.nextInt();

            switch (option) {
                case 1:
                    Shape rectangle = new Rectangle();
                    shapes.add(rectangle.toString());
                    break;
                case 2:
                    Shape square = new Square();
                    shapes.add(square.toString());
                    break;
                case 3:
                    Shape box = new Box();
                    shapes.add(box.toString());
                    break;
                case 4:
                    Shape cube = new Cube();
                    shapes.add(cube.toString());
                    break;
                case 5:
                    Shape ellipse = new Ellipse();
                    shapes.add(ellipse.toString());
                    break;
                case 6:
                    Shape circle = new Circle();
                    shapes.add(circle.toString());
                    break;
                case 7:
                    Shape sphere = new Sphere();
                    shapes.add(sphere.toString());
                    break;
                case 8:
                    Shape triangle = new Triangle();
                    shapes.add(triangle.toString());
                    break;
                case 9:
                    Shape tetrahedron = new Tetrahedron();
                    shapes.add(tetrahedron.toString());
                    break;
                default:
                    System.out.println("invalid Option");
                    break;

            }
        }

        Shape rect=new Rectangle();
        shapes.add(rect.toString());

        Shape square=new Square();
        shapes.add(square.toString());

        shapes.forEach((s) -> System.out.println(s));



    }
    }
}

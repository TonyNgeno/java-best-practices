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
            System.out.println("select 1 for rectangle" +
                    ", 2 for Square" +
                    ", 3 for Box" +
                    ", 4 for Cube " +
                    ", 5 for Ellipse  " +
                    ", 6 for Circle " +
                    ", 7 for Sphere " +
                    ", 8 for Triangle" +
                    ", 9 for Tetrahedron" +
                    " and 0 to exit.");
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
                case 0:
                    System.out.println("Thank you for your time.Come Back Again");
                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        }

        shapes.forEach((shape) -> System.out.println(shape));

    }
}

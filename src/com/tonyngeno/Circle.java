package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Circle extends Shape implements ShapePI {

    private Scanner scanner;

    public Circle() {
        scanner=new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public void prompt(Scanner scanner) {
        System.out.println("Please Input the Radius of the circle:");
        setWidth(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return Math.PI *(getWidth() * getWidth());
    }

    @Override
    public String toString() {
        return "Shape ="+"Circle"+
                " | radius ="+getWidth()+
                " | Area ="+calculateArea();
    }
}

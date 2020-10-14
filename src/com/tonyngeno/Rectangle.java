package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Rectangle extends Shape implements ShapePI {

    private Scanner scanner;

    public Rectangle() {
        scanner=new Scanner(System.in);
        prompt(scanner);
    }


    @Override
    public void prompt(Scanner scanner) {
        System.out.println("Please Input the length of the Rectangle:");
        setHeight(scanner.nextInt());
        System.out.println("Please Input the width of the rectangle:");
        setWidth(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return(getHeight()*getWidth());
    }

    @Override
    public String toString() {
        return "Area of Rectangle ="+calculateArea();
    }
}

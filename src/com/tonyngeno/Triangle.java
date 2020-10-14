package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Triangle extends Shape implements ShapePI {
    private Scanner scanner;

    public Triangle() {
        scanner=new Scanner(System.in);
        prompt(scanner);
    }


    @Override
    public void prompt(Scanner scanner) {
        System.out.println("Please Input the length of the triangle:");
        setHeight(scanner.nextInt());
        System.out.println("Please Input the width of the triangle:");
        setWidth(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return (getWidth()* getHeight())/2;
    }

    @Override
    public String toString() {
        return "Area of Triangle ="+calculateArea();
    }
}

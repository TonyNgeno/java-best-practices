package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Triangle extends Shape implements ShapePI {
    private double height, width;
    private Scanner scanner;

    public Triangle() {
        scanner=new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
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
        return "Shape ="+"Triangle"+
                " | height ="+getHeight()+
                " | width ="+getWidth()+
                " | Area ="+calculateArea();
    }
}

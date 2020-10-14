package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Cube extends Shape implements ShapePI {
    private double width;
    private Scanner scanner;

    public Cube() {
        scanner=new Scanner(System.in);
        prompt(scanner);
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
        System.out.println("Please Input the width of the Cube:");
        setWidth(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return 6 * (getWidth()*getWidth());
    }

    @Override
    public String toString() {
        return "Shape ="+"Cube"+
                " | width ="+getWidth()+
                " | Area ="+calculateArea();
    }
}

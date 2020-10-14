package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Sphere extends Shape implements ShapePI {
    private double height;
    private Scanner scanner;

    public Sphere() {
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
    public void prompt(Scanner scanner) {
        System.out.println("Please Input the radius of the Sphere:");
        setHeight(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * (getHeight() * getHeight());
    }

    @Override
    public String toString() {
        return "Shape ="+"Sphere"+
                " | radius ="+getHeight()+
                " | Area ="+calculateArea();
    }
}

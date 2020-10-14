package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Ellipse extends Shape implements ShapePI {

    private Scanner scanner;

    public Ellipse() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }


    @Override
    public void prompt(Scanner scanner) {
        System.out.println("Please Input the length of the Ellipse:");
        setHeight(scanner.nextInt());
        System.out.println("Please Input the width of the Ellipse:");
        setWidth(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return (1.0 / 4) * Math.PI * (getHeight() * getWidth());
    }

    @Override
    public String toString() {
        return "Area =" + calculateArea();
    }
}

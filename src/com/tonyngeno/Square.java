package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Square extends Shape implements ShapePI {
    private Scanner scanner;

    public Square() {
        scanner=new Scanner(System.in);
        prompt(scanner);
    }



    @Override
    public void prompt(Scanner scanner) {
        System.out.println("Please Input the length of the Square:");
        setHeight(scanner.nextInt());
    }

    @Override
    public double calculateArea() {
        return getHeight() * getHeight();
    }

    @Override
    public String toString() {
        return "Area of Square ="+calculateArea();}
}

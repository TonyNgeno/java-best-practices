package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Box extends Shape implements ShapePI {

    private Scanner scanner;

    public Box() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return (2*(getHeight()*getHeight()+getWidth()*getWidth()+getHeight()*getHeight()));
    }


    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Length  of the Box");
        setHeight(scanner.nextInt());
        System.out.println("enter the Width  of the Box");
        setWidth(scanner.nextInt());

    }

    @Override
    public String toString() {
        return "Area of Box =" + calculateArea();

    }
}

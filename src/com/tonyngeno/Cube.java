package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Cube extends Shape implements ShapePI {
    private Scanner scanner;

    public Cube() {
        scanner=new Scanner(System.in);
        prompt(scanner);
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
        return " Area =" + calculateArea();
    }
}

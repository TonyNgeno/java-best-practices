package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Tetrahedron extends Shape implements ShapePI {

    private Scanner scanner;

    public Tetrahedron() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return (Math.cbrt(Math.pow(getHeight(),2)));

    }


    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Length  of the Tetrahedron");
        setHeight(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Area of Tetrahedon="+calculateArea();
    }
}

package com.tonyngeno;

import com.tonyngeno.Interface.ShapePI;

import java.util.Scanner;

public class Tetrahedron extends Shape implements ShapePI {

    private Scanner scanner;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Tetrahedron() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return (2*(getHeight()*getHeight()+getWidth()*getWidth()+getHeight()*getHeight()));
    }


    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Length  of the Tetrahedron");
        setHeight(scanner.nextInt());
        System.out.println("enter the Width  of the Tetrahedron");
        setWidth(scanner.nextInt());
        System.out.println("enter the Height  of the Tetrahedron");
        setHeight(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Box" +
                " | Length =" + getHeight() +
                " | Width =" + getHeight() +
                " | Height =" + getHeight() +
                " | Area =" + calculateArea() ;
    }
}

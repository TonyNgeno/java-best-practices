package com.tonyngeno;

import java.util.Scanner;

public abstract class Shape {

    private double height;  // To hold height.
    private double width;  //To hold width or base

    // Set height and width
    public void setValues(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    //Get height
    public double getHeight()
    {
        return height;
    }

    //Get width
    public double getWidth()
    {
        return width;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    public void setWidth(double width) {
        this.width = Math.abs(width);
    }



    //method for prompt
    public abstract void prompt(Scanner scanner) ;

}

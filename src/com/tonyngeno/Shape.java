package com.tonyngeno;

public abstract class Shape {
    private double height;
    private double width;

    //method that prompts the user to enter each dimension for the current shape
    public void setData(double height, double width)
    {
        this.height = height;
        this.width = width;
    }


}

package edu.wpi.teamname;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double h, double w){
        height = h;
        width = w;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter(){
        return (2*height) + (2*width);
    }

    public double getArea(){
        return height*width;
    }
}

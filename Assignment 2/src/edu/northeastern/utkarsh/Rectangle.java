package edu.northeastern.utkarsh;

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double side){
        this.width = side;
        this.height = side;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(String name, String color, double width, double height){
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        this.area = this.width * this.height;
        return area;
    }

    @Override
    public double getPerimeter(){
        this.perimeter = 2*(this.width + this.height);
        return perimeter;
    }

}

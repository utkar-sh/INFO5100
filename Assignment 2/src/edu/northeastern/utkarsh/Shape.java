package edu.northeastern.utkarsh;

public class Shape{
    String name;
    String color;
    double area;
    double perimeter;

    Shape(){
    }

    Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    Shape(String name, String color, double perimeter, double area){
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape(){
        String shapeDetails = "The " + getName() + " has a " + getColor() + " color";
        return shapeDetails;
    }
}

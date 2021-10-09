package edu.northeastern.utkarsh;

public class Square extends Shape {
    double side;

    Square(double side){
        this.side = side;
    }

    Square(String name, String color, double side){
        this.name = name;
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        this.area = this.side * this.side;
        return area;
    }

    @Override
    public double getPerimeter(){
        this.perimeter = 4 * this.side;
        return perimeter;
    }
}

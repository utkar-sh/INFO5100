package edu.northeastern.utkarsh;

abstract public class Book {
    String title;
    double price;
    String publishYear;

    Book(String title, double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    abstract public String description();
}

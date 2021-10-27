package edu.northeastern.utkarsh;

public class Reference extends Book {

    String category;

    Reference(String title, double price, String publishYear){
        super(title, price, publishYear);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String description(){
        return this.title + " (title) all information is real.";
    }
}

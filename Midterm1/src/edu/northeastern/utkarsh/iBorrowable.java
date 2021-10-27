package edu.northeastern.utkarsh;

public interface iBorrowable {
//
//    String borrowDate = "";
//    String returnDate= "";

    void setBorrowDate(int day);
    void setReturnDate(int day);
    boolean isAvailable(int day);
}

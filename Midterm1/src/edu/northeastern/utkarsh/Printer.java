package edu.northeastern.utkarsh;

import java.sql.SQLOutput;

public class Printer {
    private Printer(){};

    private static Printer instance;

    private static Object obj = new Object();
    public String printerStatus = "Your printer is working.";

    public static Printer getInstance(){
        if(instance == null){
            synchronized (obj){
                if(instance == null){
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    public static void getConnection(){
        System.out.println(instance.printerStatus);
    }

}

package edu.northeastern.utkarsh;

public class Psychiatrist {
    public void observe(Moody moody){
        moody.expressFeelings();
        System.out.println("Observation: " + moody.toString());
    }

    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.queryMood();
    }
}

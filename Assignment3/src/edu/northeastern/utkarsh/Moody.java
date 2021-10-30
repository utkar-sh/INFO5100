package edu.northeastern.utkarsh;

abstract class Moody {
    abstract String getMood();

    abstract void expressFeelings();

    public void queryMood(){
        System.out.println("I feel " + getMood() + " Today");
    }
}

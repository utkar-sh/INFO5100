package edu.northeastern.utkarsh;

public class Sad extends Moody {
    public String getMood(){
        return "sad";
    }

    public void expressFeelings(){
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob‘");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}

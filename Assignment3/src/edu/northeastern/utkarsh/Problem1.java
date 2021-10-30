package edu.northeastern.utkarsh;

public class Problem1 {
    public static void main(String[] args) {
        Psychiatrist psych = new Psychiatrist();
        Happy happy = new Happy();
        Sad sad = new Sad();

        psych.examine(happy);
        System.out.println();
        psych.observe(happy);
        System.out.println();

        psych.examine(sad);
        System.out.println();
        psych.observe(sad);

    }
}

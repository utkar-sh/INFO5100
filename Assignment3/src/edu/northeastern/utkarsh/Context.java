package edu.northeastern.utkarsh;

public class Context {
    MathOperation mathOperation;
    public Context(MathOperation mathOperation){
        this.mathOperation = mathOperation;
    }

    public int execute(int num1, int num2){
        return this.mathOperation.performOperation(num1, num2);
    }
}

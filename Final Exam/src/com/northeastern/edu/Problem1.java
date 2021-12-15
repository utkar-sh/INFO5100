package com.northeastern.edu;

//This is also called class Roomba according to the question
public class Problem1 implements iRobot{
    final int[][] room;
    Direction direction;
    int row, column;

    Problem1(int[][] room){
        this.room = room;
        this.direction = Direction.DOWN;
    }

    //the method move helps identify base conditions where we check if the next tile which we are moving to based on direction is going out of bound
    //or if it's blocked. If that condition is satisfied, we return false, otherwise we return true.
    @Override
    public boolean move(){
        if(direction == Direction.DOWN){
            if(room[row][column + 1] > room.length  || room[row][column + 1]  == -1 ){
                return false;
            }
            column++;
        } else if(direction == Direction.LEFT){
            if(room[row-1][column] < 0 || room[row - 1][column] == -1){
                return false;
            }
            row--;
        } else if(direction == Direction.RIGHT){
            if(room[row + 1][column] > room.length || room[row + 1][column] == -1){
                return false;
            }
            row++;
        } else if(direction == Direction.UP){
            if(room[row][column - 1] < 0 || room[row][column - 1] == -1){
                return false;
            }
            column--;
        }
        return  true;
    }

    @Override
    public void turnLeft(){
        this.direction = Direction.LEFT;
    }

    @Override
    public void turnRight(){
        this.direction = Direction.RIGHT;
    }

    @Override
    public void clean(){
        room[row][column] = 1;
    }

    public static void main(String args[]){
        int[][] room = {
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, -1, 0, 0},
                {1, 0, 0, 0}
        };
        Problem1 problem1 = new Problem1(room);
    }
}

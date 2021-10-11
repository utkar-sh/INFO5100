package edu.northeastern.utkarsh;

//Tested on Leetcode
//Time Complexity: O(m*n)
//Space Complexity: O(1)
public class Problem1 {
    public static void main(String[] args) {

    }

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows != cols){
            int[][] transposedMatrix = new int[cols][rows];
            int val1 = 0;
            for(int[] row : matrix){
                for(int val2 = 0; val2 <cols; val2++){
                    transposedMatrix[val2][val1] = row[val2];
                }
                val1++;
            }
            return transposedMatrix;
        } else {
            for(int val1 = 0; val1 <rows; val1++){
                for(int val2=1+val1 ; val2 < cols; val2++){
                    int temp = matrix[val1][val2];
                    matrix[val1][val2] = matrix[val2][val1];
                    matrix[val2][val1] = temp;
                }
            }
            return matrix;
        }
    }
}

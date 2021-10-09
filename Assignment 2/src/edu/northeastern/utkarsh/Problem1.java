package edu.northeastern.utkarsh;

//Tested on Leetcode
//Time Complexity: O(m*n)
//Space Complexity: O(m*n)
public class Problem1 {
    public static void main(String[] args) {

    }

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows != cols){
            int[][] transposedMatrix = new int[cols][rows];
            int i = 0;
            for(int[] row : matrix){
                for(int j=0;j<cols;j++){
                    transposedMatrix[j][i] = row[j];
                }
                i++;
            }
            return transposedMatrix;
        } else {
            for(int i=0;i<rows;i++){
                for(int j=1+i;j<cols;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        }
    }
}

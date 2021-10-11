package edu.northeastern.utkarsh;

//Time Complexity: O(n*n) //where n*n is the size of the matrix
public class Problem4 {
    public static void main(String args[]){

    }

    public void rotate(int[][] matrix) {
        int n = matrix[0].length;

        for (int layer = 0; layer < n/2; layer ++) {
            for (int i=layer; i<n-layer-1; i++) {
                int temp = matrix[layer][i];

                matrix[layer][i] = matrix[n-i-1][layer];
                matrix[n-i-1][layer] = matrix[n-1-layer][n-i-1];
                matrix[n-1-layer][n-i-1] = matrix[i][n-1-layer];
                matrix[i][n-1-layer] = temp;
            }
        }
    }
}

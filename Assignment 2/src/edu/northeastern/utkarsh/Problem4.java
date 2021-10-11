package edu.northeastern.utkarsh;

//Time Complexity: O(n*n) //where n*n is the size of the matrix
public class Problem4 {
    public static void main(String args[]){

    }

    public void rotate(int[][] matrix) {
        int size = matrix[0].length;

        for (int layer = 0; layer < size/2; layer ++) {
            for (int i=layer; i<size-layer-1; i++) {
                int temp = matrix[layer][i];

                matrix[layer][i] = matrix[size-i-1][layer];
                matrix[size-i-1][layer] = matrix[size-1-layer][size-i-1];
                matrix[size-1-layer][size-i-1] = matrix[i][size-1-layer];
                matrix[i][size-1-layer] = temp;
            }
        }
    }
}

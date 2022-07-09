package ExampleProblems;

public class RotateMatrix {

    public int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        int layer = matrix.length-1;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                rotatedMatrix[j][layer] = matrix[i][j];
            }
            layer--;
        }

        return rotatedMatrix;
    }
}

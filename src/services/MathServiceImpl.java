package services;

import models.Matrix;

import java.util.Arrays;

public class MathServiceImpl implements MathService {

    public void filling(Matrix matrix){
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                matrix.getMatrix()[i][j] = (int) (Math.random() * (matrix.getRange()+1));
            }
        }
    }

    public void print(Matrix matrix){
        System.out.println("Matrix:" );
        for (int i = 0; i < matrix.getRows(); i++) {
            System.out.println(Arrays.toString(matrix.getMatrix()[i]));
        }
    }
    public void multiply(Matrix matrix1, Matrix matrix2){
        if (matrix2.getRows() == matrix1.getColumns()) {
            int[][] result = new int[matrix1.getRows()][matrix2.getColumns()];
            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix2.getColumns(); j++) {
                    for (int k = 0; k < matrix1.getColumns(); k++) {
                        result[i][j] += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j];
                    }
                }
            }
            System.out.println("Result of multiply:");
            for (int i = 0; i < matrix1.getRows(); i++) {
                System.out.print("[");
                for (int j = 0; j < matrix2.getColumns(); j++) {
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println("]");
            }
        } else {
            System.out.println("ERROR! Such matrices cannot be multiplied because the number of columns of the first matrix is not equal to the number of rows of the second matrix.");
        }
    }




}

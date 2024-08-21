import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    private final int rows;
    private final int columns;
    private final int range;
    private final int[][] matrix;

    public Matrix (int rows, int columns, int range)  {
        this.rows    = rows;
        this.columns = columns;
        this.range = range;
        this.matrix  = new int[rows][columns];
    }

    public void Filling(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * (range+1));
            }
        }
    }

    public void Print(){
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public void multiply(Matrix matrix){
        if (this.columns == matrix.rows) {
            int[][] result = new int[this.rows][matrix.columns];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < matrix.columns; j++) {
                    for (int k = 0; k < matrix.rows; k++) {
                        result[i][j] += this.matrix[i][k] * matrix.matrix[k][j];
                    }
                }
            }
            System.out.println("Result of multiply:");
            for (int i = 0; i < this.rows; i++) {
                System.out.print("[");
                for (int j = 0; j < matrix.columns; j++) {
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println("]");
            }
        } else {
            System.out.println("ERROR! Such matrices cannot be multiplied because the number of columns of the first matrix is not equal to the number of rows of the second matrix.");
        }
    }
    }


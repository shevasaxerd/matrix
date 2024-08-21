import Models.MathService;
import Models.Matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int quantityOfRows, quantityOfColumns, rangeOfValues;

        Scanner console = new Scanner(System.in);
        System.out.println("Remember, to multiply two matrices, the number of columns of the first matrix must match the number of rows of the second matrix.");
        System.out.println("Enter the size of the first matrix:");
        quantityOfRows = console.nextInt();
        quantityOfColumns = console.nextInt();
        System.out.println("Enter a range of values of first matrix:");
        rangeOfValues = console.nextInt();

        Matrix firstMatrix = new Matrix(quantityOfRows, quantityOfColumns, rangeOfValues);
        MathService.filling(firstMatrix);

        System.out.println("Enter the size of the second matrix:");
        quantityOfRows = console.nextInt();
        quantityOfColumns = console.nextInt();
        System.out.println("Enter a range of values of second matrix:");
        rangeOfValues = console.nextInt();

        Matrix secondMatrix = new Matrix(quantityOfRows, quantityOfColumns, rangeOfValues);
        MathService.filling(secondMatrix);

        MathService.print(firstMatrix);
        MathService.print(secondMatrix);

        MathService.multiply(firstMatrix, secondMatrix);

    }
}


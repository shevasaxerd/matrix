package services;

import models.Matrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainService {

    private MathService mathService;

    public MainService(){}
    public MainService(MathService mathService){
        this.mathService=mathService;
    }


    public void start(){
        int exitСriterion = 2;
        while(exitСriterion == 2) {
            //int quantityOfRows = 0, quantityOfColumns = 0, rangeOfValues = 0;

            System.out.println("Remember, to multiply two matrices, the number of columns of the first matrix must match the number of rows of the second matrix.");

            Matrix firstMatrix = new Matrix();
            checkNextStep(firstMatrix);
            mathService.filling(firstMatrix);

            Matrix secondMatrix = new Matrix();
            checkNextStep(secondMatrix);
            mathService.filling(secondMatrix);

            mathService.print(firstMatrix);
            mathService.print(secondMatrix);
            mathService.multiply(firstMatrix, secondMatrix);
            exitСriterion = chekEndOfAlgorithm(exitСriterion);

        }
    }

    void checkNextStep (Matrix matrix){
        boolean canNextStep = true;
        while (canNextStep) {
            try {
                Scanner console1 = new Scanner(System.in);
                System.out.println("Enter the size of the matrix:");
                matrix.setRows(console1.nextInt());
                matrix.setColumns(console1.nextInt());


                if (matrix.getRows() <= 0 || matrix.getColumns() <= 0) {
                    System.out.println("WARNING! The matrix size cannot be less than 1x1!");}
                else { canNextStep = false; }
            }
            catch (InputMismatchException ex) {
                System.out.println("WARNING! Please try again with a valid value (enter an integer).");
            }
        }
        canNextStep = true;
        while (canNextStep) {
            try {
                Scanner console2 = new Scanner(System.in);
                System.out.println("Enter a range of values of matrix:");
                matrix.setRange(console2.nextInt());
                canNextStep = false;}
            catch (InputMismatchException ex) {
                System.out.println("WARNING! Please try again with a valid value (enter an integer).");
            }
        }
        int[][] matrix1 = new int[matrix.getRows()][matrix.getColumns()];
        matrix.setMatrix(matrix1);
    }
    int chekEndOfAlgorithm (int exitСriterion){
        boolean canNextStep = true;
        while (canNextStep) {
            try {
                Scanner console = new Scanner(System.in);
                System.out.println("Do you want exit(1) or continue(2)?");
                exitСriterion = console.nextInt();
                if (exitСriterion!= 1 && exitСriterion != 2) {
                    System.out.println("WARNING! Please enter 1 or 2.");}
                else canNextStep = false;}
            catch (InputMismatchException ex) {
                System.out.println("WARNING! Please enter 1 or 2.");

            }
        } return exitСriterion;
    }
}

package services;

import models.Matrix;

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
            int quantityOfRows, quantityOfColumns, rangeOfValues;

            Scanner console = new Scanner(System.in);
            System.out.println("Remember, to multiply two matrices, the number of columns of the first matrix must match the number of rows of the second matrix.");
            System.out.println("Enter the size of the first matrix:");
            quantityOfRows = console.nextInt();
            quantityOfColumns = console.nextInt();
            System.out.println("Enter a range of values of first matrix:");
            rangeOfValues = console.nextInt();

            Matrix firstMatrix = new Matrix(quantityOfRows, quantityOfColumns, rangeOfValues);
            mathService.filling(firstMatrix);

            System.out.println("Enter the size of the second matrix:");
            quantityOfRows = console.nextInt();
            quantityOfColumns = console.nextInt();
            System.out.println("Enter a range of values of second matrix:");
            rangeOfValues = console.nextInt();

            Matrix secondMatrix = new Matrix(quantityOfRows, quantityOfColumns, rangeOfValues);
            mathService.filling(secondMatrix);

            mathService.print(firstMatrix);
            mathService.print(secondMatrix);

            mathService.multiply(firstMatrix, secondMatrix);

            System.out.println("Do you want exit(1) or continue(2)?");
            exitСriterion = console.nextInt();

        }
    }

}

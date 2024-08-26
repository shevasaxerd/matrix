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
            int quantityOfRows, quantityOfColumns, rangeOfValues;

            Scanner console = new Scanner(System.in);
            System.out.println("Remember, to multiply two matrices, the number of columns of the first matrix must match the number of rows of the second matrix.");

            while (true) {
                try {
                    Scanner console1 = new Scanner(System.in);
                    System.out.println("Enter the size of the first matrix:");
                    quantityOfRows = console1.nextInt();
                    quantityOfColumns = console1.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("WARNING! Please try again with a valid value (enter an integer).");
                    continue;

                }
                break; }

           while (true) {
            try {
                Scanner console2 = new Scanner(System.in);
                System.out.println("Enter a range of values of first matrix:");
            rangeOfValues = console2.nextInt(); } catch (InputMismatchException ex) {
               System.out.println("WARNING! Please try again with a valid value (enter an integer).");
                continue;
           }
            break;}

            Matrix firstMatrix = new Matrix(quantityOfRows, quantityOfColumns, rangeOfValues);
            mathService.filling(firstMatrix);

            while (true) {
            try {
                Scanner console3 = new Scanner(System.in);
                System.out.println("Enter the size of the second matrix:");
            quantityOfRows = console3.nextInt();
            quantityOfColumns = console3.nextInt(); } catch (InputMismatchException ex) {
                System.out.println("WARNING! Please try again with a valid value (enter an integer).");
                continue;
            }
            break; }

            while (true) {
                Scanner console4 = new Scanner(System.in);
             try { System.out.println("Enter a range of values of second matrix:");
            rangeOfValues = console4.nextInt(); } catch (InputMismatchException ex) {
                 System.out.println("WARNING! Please try again with a valid value (enter an integer).");
                 continue;
             }
            break;}

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

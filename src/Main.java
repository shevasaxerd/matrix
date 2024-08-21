import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b, c, d, x, y;

        Scanner console = new Scanner(System.in);
        System.out.println("Remember, to multiply two matrices, the number of columns of the first matrix must match the number of rows of the second matrix.");
        System.out.println("Enter the size of the first matrix:");
        a = console.nextInt();
        b = console.nextInt();
        System.out.println("Enter a range of values of first matrix:");
        x = console.nextInt();

        Matrix firstMatrix = new Matrix(a, b, x);

        System.out.println("Enter the size of the second matrix:");
        c = console.nextInt();
        d = console.nextInt();
        System.out.println("Enter a range of values of second matrix:");
        y = console.nextInt();

        Matrix secondMatrix = new Matrix(c, d, y);

        firstMatrix.Print();
        secondMatrix.Print();

    }
}


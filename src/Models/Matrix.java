package Models;

import java.util.Arrays;

public class Matrix {

    private int rows;
    private int columns;
    private int range;
    private int[][] matrix;

    public Matrix (int rows, int columns, int range)  {
        this.rows    = rows;
        this.columns = columns;
        this.range = range;
        this.matrix  = new int[rows][columns];
    }

    public int getRows(){ return rows;}
    public void setRows(int rows){ this.rows = rows;}
    public int getColumns(){ return columns;}
    public void setColumns(int columns){ this.columns = columns;}
    public int getRange(){ return range;}
    public void setRange(int range){ this.range = range;}
    public int[][] getMatrix() {return matrix;}
    public void setMatrix(int[][] matrix) {this.matrix = matrix;}
}


package services;

import models.Matrix;

import java.util.Arrays;

public interface MathService {
    public void filling(Matrix matrix);
    public void print(Matrix matrix);
    public void multiply(Matrix matrix1, Matrix matrix2);
}

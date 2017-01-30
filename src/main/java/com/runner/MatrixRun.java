package com.runner;

import com.matrix.Matrix;
import com.matrixIO.MatrixUtil;

import java.io.IOException;

public class MatrixRun {

    public static void main(String[] args) throws NumberFormatException, IOException {

        Matrix first = new Matrix(2, 2);

        MatrixUtil.fill(first);
        MatrixUtil.print(first);
        Matrix second = new Matrix(2, 3);
        MatrixUtil.fill(second);
        MatrixUtil.print(second);

        Matrix mul = first.multiply(second);

        MatrixUtil.print(mul);

    }
}

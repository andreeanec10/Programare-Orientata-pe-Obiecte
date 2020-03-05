package com.company.task2;

import java.util.ArrayList;

public class MyMatrix implements Sumabil {
    public ArrayList<Integer>[] matrix = new ArrayList[4];
    public void setMatrix(ArrayList<Integer>[] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void addValue(Sumabil value) {
        MyMatrix mat = (MyMatrix) value;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].size(); j++) {
                matrix[i].set(j, (Integer) matrix[i].get(j) + mat.matrix[i].get(j));
            }
        }
    }

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].size(); j++) {
                sum += matrix[i].get(j);
           }
        }
        return sum;
    }
}

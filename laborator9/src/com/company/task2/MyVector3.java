package com.company.task2;

import java.util.ArrayList;

public class MyVector3 implements Sumabil {
    public ArrayList<Integer> vector = new ArrayList(3);

    @Override
    public void addValue(Sumabil value) {
        MyVector3 ex = (MyVector3) value;
        for(int i =0; i < vector.size(); i++)
            vector.set(i, (Integer) ex.vector.get(i) + vector.get(i));
    }

    @Override
    public int sum() {
        int sum = 0;
        for(int i =0; i < vector.size(); i++)
            sum += vector.get(i);
        return sum;
    }
}

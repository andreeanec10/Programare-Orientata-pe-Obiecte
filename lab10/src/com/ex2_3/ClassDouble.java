package com.ex2_3;

import java.util.Collection;

public class ClassDouble implements Calculator {

    @Override
    public Double add(Double nr1, Double nr2) {
        double sum = 0;
        try {
            sum = nr1 + nr2;
        } catch (NullPointerException e) {
            if (nr1 == null || nr2 == null) {
                System.out.println(e);
                return null;
            }
        } catch (OverflowException ex) {
            if ( sum == Double.POSITIVE_INFINITY) {
                System.out.println(ex);
                return null;
            }
        } catch (UnderflowException exe) {
            if ( sum == Double.NEGATIVE_INFINITY) {
                System.out.println(exe);
                return null;
            }
        }
        return sum;
    }

    @Override
    public Double average(Collection<Double> numbers) {
        double sum = 0;
        for (Double d: numbers) {
            sum = add(sum, d);
        }
        return divide(sum, (double)numbers.size());
    }

    @Override
    public Double divide(Double nr1, Double nr2) {
        double div = 0;
        try {
            div = nr1 / nr2;
        } catch (NullPointerException e) {
            if (nr1 == null || nr2 == null) {
                System.out.println(e);
                return null;
            }
        } catch (OverflowException ex) {
            if ( div == Double.POSITIVE_INFINITY) {
                System.out.println(ex);
                return null;
            }
        } catch (UnderflowException exe) {
            if ( div == Double.NEGATIVE_INFINITY) {
                System.out.println(exe);
                return null;
            }
        }
        return div;
    }
}

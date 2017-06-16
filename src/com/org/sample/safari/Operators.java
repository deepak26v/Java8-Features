package com.org.sample.safari;

interface BinaryIntOp {
    abstract int compute(int arg1, int arg2);
}

public class Operators {
    public static void main(String[] args) {
        BinaryIntOp addOp = (a, b) -> a + b;

        System.out.println(addOp.compute(1,1));
    }
}

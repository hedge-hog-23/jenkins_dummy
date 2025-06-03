package com.example.factorial;

public class Factorial {
    public static int compute(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        if (n == 0) return 1;
        return n * compute(n - 1);
    }
    public static void main(String args[]) {
    	System.out.println(compute(10));
    }
}

package it.uom.cse;

import java.util.Arrays;

public class MathOperation {

    public static double add(double... operands) {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 2; i < n + 1; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}

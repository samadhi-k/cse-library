package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
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

    public static int sumOfPrimes(int n){
            int sum = 0;
            for (int p : listPrimes(n- 1))
                sum += p;
            return sum;
    }
    public static int[] listPrimes(int n) {
        boolean[] isPrime = listPrimality(n);
        int count = 0;
        for (boolean b : isPrime) {
            if (b)
                count++;
        }

        int[] result = new int[count];
        for (int i = 0, j = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

    public static boolean[] listPrimality(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative array size");
        boolean[] result = new boolean[n + 1];
        if (n >= 2)
            result[2] = true;
        for (int i = 3; i <= n; i += 2)
            result[i] = true;
        // Sieve of Eratosthenes
        for (int i = 3, end = (int)Math.sqrt(n); i <= end; i += 2) {
            if (result[i]) {
                // Note: i * i does not overflow
                for (int j = i * i, inc = i * 2; j <= n; j += inc)
                    result[j] = false;
            }
        }
        return result;
    }

}

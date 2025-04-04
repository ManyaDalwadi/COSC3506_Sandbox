public class AdvancedCalculator 
{
    // Power function
    public static double power(double base, int exponent) 
    {
        if (base == 0 && exponent < 0) 
        {
            throw new IllegalArgumentException("Cannot raise 0 to a negative power.");
        }
        return Math.pow(base, exponent);
    }

    // Square root function
    public static double squareRoot(int i) 
    {
        if (i < 0) 
        {
            throw new IllegalArgumentException("Square root of negative numbers is not allowed.");
        }
        return Math.sqrt(i);
    }

    // Checking if a number is prime
    public static boolean isPrime(int n) 
    {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Factorial function
    public static long factorial(int n) 
    {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) 
        {
            result *= i;
        }
        return result;
    }
}

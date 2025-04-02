public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // there is no exception for when the base is 0, so I created one
        if(base == 0 && exponent < 0){
            throw new IllegalArgumentException("Base cannot be zero");
        }
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    // Checks if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    // this method only calculates for int data type, so I changed it to long to accomodate more numbers
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
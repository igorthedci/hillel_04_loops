/**
 * "7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 * If one of the parameters is < 10, method should return -1 to indicate an invalid value.
 * The method should return the greatest common divisor of two numbers."
 */
public class task_07_getGreatestCommonDivisor {

    public static void main(String[] args) {
        test_getGreatestCommonDivisor(1, 1);
        test_getGreatestCommonDivisor(1, 11);
        test_getGreatestCommonDivisor(11, 1);
        test_getGreatestCommonDivisor(11, 11);
        test_getGreatestCommonDivisor(12, 18);
        test_getGreatestCommonDivisor(11, 22);
    }

    /**
     * The greatest common divisor is the largest positive integer
     * that can fully divide each of the integers(i.e. without living a remainder).
     * @param a
     * @param b
     * @return
     */
    private static void test_getGreatestCommonDivisor (int a, int b) {
        int result = getGreatestCommonDivisor(a, b);
        System.out.print("Numbers: " + a + ", " + b);
        System.out.println(". GCD: " + result);
    }
    private static int getGreatestCommonDivisor (int a, int b) {
        // Euclidean algorithm
        // https://younglinux.info/algorithm/euclidean

        if (a < 10 || b < 10)
            return -1;

        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }

        return a + b; // one var is zero, other is GCD
    }
}

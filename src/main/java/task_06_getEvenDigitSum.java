/**
 * 6. Write a method named getEvenDigitSum with one parameter of the type "int".
 * The method should return the sum of even digits within the number.
 * If the number is negative, method should return -1;
 */

public class task_06_getEvenDigitSum {

    public static void main(String[] args) {

        test_getEvenDigitSum(-1);
        test_getEvenDigitSum(0);
        test_getEvenDigitSum(1);
        test_getEvenDigitSum(12);
        test_getEvenDigitSum(12345);
        test_getEvenDigitSum(1234567890);

    }

    private static int getEvenDigitSum(int a) {

        if (a < 0)
            return -1;

        int sum = 0;
        while (a > 0) {
            sum += a % 10; // get the last digit of number
            a /= 100;
        }
        return sum;
    }

    private static void test_getEvenDigitSum(int a) {
        int aSum = getEvenDigitSum(a);
        System.out.println("Number: " + a + " Sum: " + aSum);
    }

}

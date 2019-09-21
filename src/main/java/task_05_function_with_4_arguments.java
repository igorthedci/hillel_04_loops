import java.sql.SQLOutput;

/**
 * "5. Write a function which calculates and returns the minimum of 4 arguments.
 * public static void main(String[] args) {
 *         // write your code here
 * }
 *
 *
 * public static int min(int a, int b, int c, int d) {
 *
 * }
 * public static int min(int a, int b) {
 *
 * }"
 */
public class task_05_function_with_4_arguments {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);

        int min4 = min(a, b, c, d);

        // display variables to check
        System.out.print("Four numbers: ");
        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println("Min number: " + min4);
    }

    public static int min(int a, int b, int c, int d) {
        int result;
        result = min(a, b);
        result = min(result, c);
        result = min(result, d);

        return result;
    }

    public static int min(int a, int b) {
        // return (a < b) ? a : b;
        return Math.min(a, b);
    }
}

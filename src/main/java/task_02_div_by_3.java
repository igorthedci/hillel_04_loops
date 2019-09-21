/**
 * "2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.
 * "
 */
public class task_02_div_by_3 {

    public static void main(String[] args) {

        System.out.println("Numbers are divided by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

/**
 * "8. Write a program which prints the next figure to the console:
 * **********
 * **********
 * **********
 * **********"
 */
public class task_08_stars {
    public static void main(String[] args) {
        int qtyStars = 10;
        int qtyLines = 4;
        String strStars = "";

        // create a string of stars
        for (int i = 0; i < qtyStars; i++) {
            strStars += "*";
        }

        // print strings to check
        for (int i = 0; i < qtyLines; i++) {
            System.out.println(strStars);
        }
    }
}

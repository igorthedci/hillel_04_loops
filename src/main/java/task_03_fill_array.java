/**
 * "3. Fill the array with numbers from 100 to 0.
 * "
 */

public class task_03_fill_array {

    public static void main(String[] args) {

        int arrayInt[] = new int[101];

        int indexArray = 0;

        // fill arrayInt with numbers
        for (int i = 100; i > 0; i--) {
            arrayInt[indexArray++] = i;
        }

        // display arrayInt[] to check
        indexArray = 0;
        for (int i : arrayInt) {
            System.out.print(i + " ");
            indexArray++;
            if (indexArray % 10 == 0) {
                System.out.println();
            }
        }
    }
}

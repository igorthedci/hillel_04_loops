/**
 * 4. Given an array of 10 integers.
 * To display the sum of all its elements except the first and last.
 */
public class task_04_sum_of_array {

    public static void main(String[] args) {

        int lengthArray = 10;
        int[] arrayInt = new int[lengthArray];

        // fill arrayInt with numbers
        for (int i = 0; i < lengthArray; i++) {
            arrayInt[i] = (int) (Math.random() * 10);
        }

        // sum elements of arrayInt[]
        int sum = 0;
        int firstIndex = 0;
        int lastIndex = lengthArray - 1;
        for (int i = 0; i < lengthArray; i++) {
            if (i == firstIndex)
                continue;
            if (i == lastIndex)
                continue;
            sum += arrayInt[i];
        }

        // display arrayInt[] and sum to check
        System.out.print("Array: ");
        for (int i : arrayInt)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}

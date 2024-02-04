import java.util.Scanner;
import java.util.Random;

public class ArrayDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10)+ 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int current = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    if (count > 1) {
                        current = array[j];
                    }
                }
            }
            insert(array, current);
            if (count > 1 && current != 0) {
                System.out.println(current + " appears in the list " + count + " times.");
            }
        }
    }
    public static int [] insert(int [] arr, int element) {
        int [] num = arr;
        for (int i = 0; i < num.length; i++) {
            if (arr[i] == element) {
                arr[i] = 0;
            }
        }
        return num;
    }
}
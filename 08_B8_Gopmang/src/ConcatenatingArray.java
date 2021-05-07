import java.util.Scanner;

public class ConcatenatingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array1:");
        int size1 = sc.nextInt();
        int[] array1 = createArray(size1);
        displayArr(array1);
        System.out.println("Enter size array2:");
        int size2 = sc.nextInt();
        int[] array2 = createArray(size2);
        displayArr(array2);
        System.out.println("Enter size array3:");
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        displayArr(array3);
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        displayArr(array3);
        for (int i = array1.length; i<array3.length;i++){
            array3[i] = array2[i - array1.length];
        }
        displayArr(array3);
    }
    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
        }
        return arr;
    }

    public static void displayArr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = sc.nextInt();
            if (size > 20 || size < 1) {
                System.out.println("Wrong size!!");
            }
        } while (size > 20 || size < 1);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Elements in array: ");
        arr(array);
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("Reverse array: ");
        arr(array);
    }
    public static void arr(int[] array){
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size of Array:");
            size = scanner.nextInt();
            if (size<=0) {
                System.out.println("Wrong size of Array!");
            }
        } while (size<=0);
        int[] array = createArray(size);
        displayArray(array);
        int min = minValue(array);
        System.out.println("The smallest value in the Array is: "+min);
    }
    static int[] createArray (int size) {
        int[] array = new int[size];
        for (int i=0;i<array.length;i++) {
            array[i] = (int) (Math.round(Math.random()*30));
        }
        return array;
    }
    static void displayArray (int[] arr){
        for (int value: arr) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    static int minValue (int[] arr) {
        int min = arr[0];
        for (int value: arr) {
            if (value<min) {
                min = value;
            }
        }
        return min;
    }
}

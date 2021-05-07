import java.util.Scanner;

public class DeletingValueInArray {
    public static int[] createArray (int n) {
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int) Math.round(Math.random()*10);
        }
        return arr;
    }
    public static int findIndex (int[] arr, int number) {
        int index = -1;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void displayArr(int[] arr) {
        for (int x: arr) {
            System.out.print(x +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int n = sc.nextInt();
        int[] array = createArray(n);
        displayArr(array);
        System.out.println();
        System.out.println("Enter value: ");
        int number = sc.nextInt();
        boolean check = true;
        while (check){
            int index = findIndex(array, number);
            if (index == -1) {
                check = false;
                System.out.println("Value is not in the Array!");
                break;
            }
            for (int i = index; i<array.length-1;i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            displayArr(array);
            System.out.println();
        }
    }
}

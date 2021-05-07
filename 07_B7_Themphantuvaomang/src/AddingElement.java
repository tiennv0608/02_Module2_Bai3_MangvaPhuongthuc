import java.util.Scanner;

public class AddingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] array = createArray(size);
        displayArr(array);
        System.out.println();
        System.out.println("Enter number you want to add:");
        int number = sc.nextInt();
        System.out.println("Enter position you want to add:");
        int index = sc.nextInt();
        addElementInArray(array,number,index-1);
    }
    public static void addElementInArray (int[] arr, int number, int index) {
        for (int i = arr.length-1; i>index;i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = number;
        for (int x: arr){
            System.out.print(x +" ");
        }
        System.out.println();
    }
    public static int[] createArray (int n) {
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int) Math.round(Math.random()*10);
        }
        return arr;
    }
    public static void displayArr(int[] arr) {
        for (int x: arr) {
            System.out.print(x +" ");
        }
    }
}

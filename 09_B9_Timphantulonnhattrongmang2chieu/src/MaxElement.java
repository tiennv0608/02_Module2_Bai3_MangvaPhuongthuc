import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter numbers of columns:");
        int columns = sc.nextInt();
        float[][] array = createArray(rows, columns);
        displayArr(array);
        float max = maxValue(array);
        System.out.println("Max value in array is: " + max);
    }

    public static float[][] createArray(int row, int column) {
        float[][] arr = new float[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (float) (Math.random() * 10);
            }
        }
        return arr;
    }

    public static void displayArr(float[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static float maxValue(float[][] arr) {
        float max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

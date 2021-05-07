import java.util.Scanner;

public class SumOfMainDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of Array:");
        int number = sc.nextInt();
        float[][] array = createArray(number);
        displayArr(array);
        float sum1 = sumOfMainDiagonalLine(array);
        System.out.println("Sum of Main Diagonal Line is: "+ sum1);
    }
    public static float[][] createArray(int n) {
        float[][] arr = new float[n][n];
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
    public static float sumOfMainDiagonalLine (float[][] arr){
        float sum = 0;
        for (int i = 0; i< arr.length;i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}

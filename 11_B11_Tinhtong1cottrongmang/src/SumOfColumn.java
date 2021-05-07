import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of column:");
        int cols = sc.nextInt();
        float[][] arr = createArray(rows,cols);
        displayArr(arr);
        System.out.println("Enter columns you want to sum:");
        int column = sc.nextInt();
        float sumCols =sumOfColumn(arr,column-1);
        System.out.println("Sum of column "+column+" is: "+sumCols);
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
    public static float sumOfColumn (float[][] arr, int cols) {
        float sumCols = 0;
        for (int i =0; i < arr.length; i++) {
            sumCols += arr[i][cols];
        }
        return sumCols;
    }
}

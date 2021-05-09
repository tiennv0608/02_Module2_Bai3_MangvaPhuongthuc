import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;

        int[] arr = new int[100];
        int size = 0;
        int number;
        int index;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Nhập lựa chọn:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    size = inputSize();
                    inputArray(arr, size);
                    break;
                case 2:
                    displayArray(arr, size);
                    break;
                case 3:
                    int maxEven = findMaxEven(arr, size);
                    if (maxEven % 2 == 0) {
                        System.out.println("Số chẵn lớn nhất trong mảng là: " + maxEven);
                    } else {
                        System.out.println("Mảng vừa nhập không có số chẵn");
                    }
                    break;
                case 4:
                    displayEven(arr, size);
                    break;
                case 5:
                    int sumEven = sumEven(arr, size);
                    System.out.println("Tổng các số chẵn trong mảng là: " + sumEven);
                    break;
                case 6:
                    System.out.println("Nhập giá trị muốn chèn:");
                    number = sc.nextInt();
                    System.out.println("Nhập vị trí cần chèn:");
                    do {
                        index = sc.nextInt();
                        if (index < 1 || index >= size) {
                            System.out.println("Vị trí chèn sai!");
                            System.out.println("Mời nhập lại vị trí cần chèn:");
                        }
                    } while (index < 1 || index >= size);
                    arr = addElement(arr, size, number, index - 1);
                    size+=1;
                    displayArray(arr, size);
                    break;
                case 7:
                    System.out.println("Nhập giá trị muốn xóa:");
                    number = sc.nextInt();
                    int[] newArr = deleteElement(arr, size, number);
                    size = newArr.length;
                    arr = newArr;
                    displayArray(arr, size);
                    break;
                case 8:
                    int[] reverseArray = reverseArr(arr, size);
                    displayArray(reverseArray, size);
                    break;
                case 9:
                    System.out.println("Danh sách số nguyên tố trong mảng là:");
                    displayPrimeInArray(arr,size);
                    break;
                case 10:
                    int[] sortArray = sortArr(arr,size);
                    displayArray(sortArray,size);
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
        } while (choice >= 1 && choice <= 11);
    }

    static void menu() {
        System.out.println("========MENU========");
        System.out.println("1. Nhập mảng có kích thước N (0<N<100)");
        System.out.println("2. Hiển thị mảng vừa nhập");
        System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
        System.out.println("4. Liệt kê danh sách các số chẵn trong mảng");
        System.out.println("5. Tính tổng các số chẵn trong mảng");
        System.out.println("6. Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng, chèn giá trị đó vào mảng");
        System.out.println("7. Xoá tất cả các phần tử có giá trị bằng X (được nhập từ bàn phím) khỏi mảng");
        System.out.println("8. Đảo ngược mảng ban đầu");
        System.out.println("9. Hiển thị danh sách các số nguyên tố trong mảng");
        System.out.println("10. Sắp xếp mảng theo thứ tự giảm dần");
        System.out.println("11. Thoát");
    }

    static int inputSize() {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc cua mang(0<N<100): ");
            size = sc.nextInt();
        } while (size <= 0 || size >= 100);
        return size;
    }

    static void inputArray(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang gom N phan tu: ");
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
    }

    static void displayArray(int[] arr, int size) {
        System.out.println("Mang la: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    static int findMaxEven(int[] arr, int size) {
        int maxEven = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > maxEven && arr[i] % 2 == 0) {
                maxEven = arr[i];
            }
        }
        return maxEven;
    }

    static void displayEven(int[] arr, int size) {
        System.out.println("Danh sách các số chẵn trong mảng là:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static int sumEven(int[] arr, int size) {
        int sumEven = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }
        }
        return sumEven;
    }

    static int[] addElement(int[] arr, int size, int number, int index) {
        int[] arr1 = new int[size + 1];
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        for (int j = size; j > index; j--) {
            arr1[j] = arr[j - 1];
        }
        arr1[index] = number;
        return arr1;
    }

    static int[] deleteElement(int[] arr, int size, int value) {
        int index;
        int count = 0;
        do {
            index = findValue(arr, size, value);
            if (index == -1) {
                break;
            } else {
                for (int i = index; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                count++;
            }
        } while (index != -1);
        int[] arr1 = new int[size - count];
        for (int j = 0; j < size - count; j++) {
            arr1[j] = arr[j];
        }
        return arr1;
    }

    static int findValue(int[] arr, int size, int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }

    static int[] reverseArr(int[] arr, int size) {
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    static void displayPrimeInArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    static int[] sortArr(int[] arr, int size) {
        for (int i =0; i<size-1;i++) {
            for (int j = i+1; j<size;j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
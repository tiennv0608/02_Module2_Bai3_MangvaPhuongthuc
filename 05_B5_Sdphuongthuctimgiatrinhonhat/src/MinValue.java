public class MinValue {
    public static int minValue (int[] arr) {
        if (arr.length <=0){
            return -1;
        }
        int min = arr[0];
        int inDex = 0;
        for (int i = 1; i<arr.length; i++) {
            if (arr[i]<min) {
                min =arr[i];
                inDex = i;
            }
        }
        return inDex;
    }

    public static void main(String[] args) {
        int[] arr = {4,12,7,8,1,6,9};
        int inDex = minValue(arr);
        if (inDex == -1) {
            System.out.println("There is no element in the array!");
        } else {
            System.out.println("The smallest element in the array is: "+arr[inDex]);
        }
    }
}

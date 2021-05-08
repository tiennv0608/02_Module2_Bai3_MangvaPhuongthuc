import java.util.Scanner;

public class CountTheLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println("Enter letter you want to count:");
        char letter = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == letter) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("There are " + count + " letter " + letter + " in sentence");
        } else {
            System.out.println("There is " + count + " letter " + letter + " in sentence");
        }
    }
}

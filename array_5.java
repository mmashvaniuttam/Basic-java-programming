import java.util.Scanner;

public class array_5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element that you want to store");
        n = sc.nextInt();
        int a[] = new int[10];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array element are:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}

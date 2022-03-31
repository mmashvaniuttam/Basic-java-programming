import java.util.*;

public class input_in_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = scn.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of the array:\n");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            System.out.println("Print the content\n" + Arrays.toString(a));
        }

    }

}

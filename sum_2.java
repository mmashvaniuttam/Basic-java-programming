import java.util.Scanner;

public class sum_2 {
    public static void main(String[] args) {
        int n1, n2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        n2 = sc.nextInt();
        sum = n1 + n2;
        System.out.printf("Sum of two number:=%d", +sum);
    }

}

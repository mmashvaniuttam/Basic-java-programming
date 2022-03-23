import java.util.Scanner;

public class increment_1 {
    public static void main(String[] args) {
        int x, sum;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        x = scn.nextInt();
        sum = ++x;
        System.out.printf("Sum is:%d", +x);

    }

}

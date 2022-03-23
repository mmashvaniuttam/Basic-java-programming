import java.util.Scanner;

public class increment_2 {
    public static void main(String[] args) {
        int x, sum;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        x = scn.nextInt();
        x++;
        sum = x + x++;
        System.out.printf("Print the value of %d", +sum);

    }

}

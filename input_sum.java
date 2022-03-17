import java.util.Scanner;

public class input_sum {
    public static void main(String[] args) {
        int x;
        int y;
        int sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The First Number");
            x = sc.nextInt();
            System.out.println("Enter The Second Number");
            y = sc.nextInt();
        }
        sum = sum(x, y);
        System.out.println("The Sum Of Two Number:" + sum);
    }

    private static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}

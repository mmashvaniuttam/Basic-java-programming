import java.util.Scanner;

public class arthimatic_operators {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x, y, sum, multi, div, sub, mod;
        System.out.println("Enter a number");
        x = scn.nextInt();
        System.out.println("Enter the second number");
        y = scn.nextInt();
        sum = x + y; // plus operator
        sub = x - y; // substraction operator
        multi = x * y; // multiple operator
        div = x / y; // division operator
        mod = x % y; // modlus operator
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

    }

}

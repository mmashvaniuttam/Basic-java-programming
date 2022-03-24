import java.util.Scanner;

/**
 * operators
 */
public class operators {
    public static void main(String[] args) {
        // java unary operator
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scn.nextInt();
        System.out.println(x++); // postfix opreator
        System.out.println(++x); // prefix operator
        System.out.println(x--); // postfix opreator
        System.out.println(--x); // prefix operator
    }

}
import java.util.Scanner;

/**
 * if_sta3
 */
public class if_sta3 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (true) {
            System.out.println("In the loop");
            if (i == 1000) {
                break;
            }
            i++;
            System.out.println("Out of loop");
        }

    }
}
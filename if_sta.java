import java.util.Scanner;

/**
 * if_sta
 */
public class if_sta {
    /**
     *
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number=");
            int aValue = input.nextInt();
            if (aValue < 30) {
                System.out.println("Ashvani \n");
            } else {
                System.out.println("Uttam\n");
            }
        }
    }
}

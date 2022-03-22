import java.util.Scanner;

/**
 * switch_statement
 */
public class switch_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your instruction");
        String text = input.nextLine();
        switch (text) {
            case "run":
                System.out.println("program is running");
                break;
            case "stop":
                System.out.println("prorgam is stoped");
            default:
                System.out.println("instruction not recognize");
        }
    }

}

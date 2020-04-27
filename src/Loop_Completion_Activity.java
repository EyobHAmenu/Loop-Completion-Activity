import java.util.Scanner;

public class Loop_Completion_Activity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            num = keyboard.nextInt();
            total += num;
        }
        // Loop should end here

        System.out.println("The total of all 10 numbers is " + total);

    }
}



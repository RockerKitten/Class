package Week2;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        int counter;

        // write your loop and conditionals below here
        if ((userNumber > 1) && (userNumber < 100)) {
            while (userNumber <= 100) {
                System.out.println(userNumber);
                userNumber++;
            }
        }
        else {System.out.println("Your number was not between 1 and 100.");}

    }
}

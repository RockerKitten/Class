package Week2;

import java.util.Scanner;

public class Conditional3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String randomWord = in.next();

        // Create your if statement below.  Check the length of the variable of randomWord
        if (randomWord.length() >= 10) {
            System.out.println("That is a really long word!");
        } else {
            System.out.println("Your word is not that long.");
        }
    }
}

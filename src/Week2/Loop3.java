package Week2;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userValue;
        userValue = in.nextInt();

        // add your code below this line
        if (userValue > 0){
            for (int i = 1; i < 100; i = userValue + i) {
                System.out.println(i);
            }
        }
        else {System.out.println("Your number needs to be greater than 0.");}

    }
}

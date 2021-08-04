package Week2;

import java.util.Scanner;

public class Conditional5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();

        //Add your code here:
    if (firstNumber > secondNumber) {
        System.out.println("Larger");
    }
    else {System.out.println("Smaller");}

        int a = in.nextInt();

        //write your if/else statement here to check if the value stored in the variable a is even or odd
        if (a % 2 == 0 ) {System.out.println("even");}
        else {System.out.println("odd");}

    }
}

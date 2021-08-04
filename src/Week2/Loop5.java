package Week2;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args)    {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        // write your code below this line
        if (x > 0){
            for (int i = 0; i <= x; i++)
            {
                System.out.println(i);
            }
        }
        else {
        //Use this line for printing to the console if the value of x is less than 1.
        System.out.println("Please enter a number greater than 0.");}

    }
}

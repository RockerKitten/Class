package Week2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Boolean4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double assignment1, assignment2, assignment3, assignment4;
        assignment1 = in.nextDouble();
        assignment2 = in.nextDouble();
        assignment3 = in.nextDouble();
        assignment4 = in.nextDouble();

        //Write your code below this line

        if (((assignment1 + assignment2) > 150.0) && ((assignment3 > 70.0) || (assignment4 > 70.0)))
        {
        // Write your if statement here
        System.out.println("You passed the class."); }
        else {
        // Use this for your else statement
        System.out.println("You failed the class.");}



        //Write your code above this line
    }

}

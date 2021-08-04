package Week2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Boolean2 {
    static void playoffs(int wins, int losses, boolean isFall) {
        if ((wins > losses) && isFall)
        {
            System.out.println("It's looking good for your team to make the playoffs.");
        }
        if ((wins > losses) && !isFall)
        {
            System.out.println("Looking good, but it's too early to tell");
        }
        if ((wins < losses) && isFall)
        {
            System.out.println("Things are not looking good");
        }
    }
    //Do not change the code below this line
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wins, losses;
        boolean isFall;
        wins = in.nextInt();
        losses = in.nextInt();
        isFall = in.nextBoolean();
        playoffs(wins, losses, isFall);
    }
}

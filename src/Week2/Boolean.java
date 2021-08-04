package Week2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Boolean {
    static void wordLength(String word1, String word2, String word3) {
        // Write your code below this line
        if (word1.length() > word2.length() && word1.length() > word3.length())
        {
            System.out.println("true");
        }
            else {System.out.println("false");}
    }
        // Do not change any code below this line
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String word1, word2, word3;
            word1 = in.nextLine();
            word2 = in.nextLine();
            word3 = in.nextLine();
            wordLength(word1, word2, word3);
    }
}

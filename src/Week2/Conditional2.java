package Week2;

import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x >= 0) {
            if (y >= 0) {
                System.out.println("The point is in quadrant I");
            } else {
                System.out.println("The point is in quadrant IV");
            }
        }
        if (x < 0){
            if (y >= 0){
                System.out.println("The point is in quadrant II");
            }
            else {System.out.println("The point is in quadrant III");}
        }
    }
}

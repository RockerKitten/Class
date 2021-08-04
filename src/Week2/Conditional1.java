package Week2;

import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numericGrade = in.nextInt();
          if (numericGrade >= 90) {
              System.out.println("A");
          }
          else if (numericGrade >= 80) {
              System.out.println("B");
          }
          else if (numericGrade >= 70) {
              System.out.println("C");
          }
          else if (numericGrade >= 60) {
              System.out.println("D");
          }
          else {System.out.println("F");}
    }
}

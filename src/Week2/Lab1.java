package Week2;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 100; i++){
            if (i%2==0)
            {System.out.println("EVEN");}
            else {System.out.println("ODD");}
        }
        int x = 100;
        while (x >= 0) {
            System.out.println(x%3);
            x--;
        }*/

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the your membership status. You may choose SILVER, GOLD, or PLATINUM");
        var loyaltyMemberStatus = in.next();
        double loyaltyMemberDiscount;
        switch (loyaltyMemberStatus) {
            case "SILVER":
                loyaltyMemberDiscount = 0.10;
                break;
            case "GOLD":
                loyaltyMemberDiscount = 0.15;
                break;
            case "PLATINUM":
                loyaltyMemberDiscount = 0.25;
                break;
            default:
                loyaltyMemberDiscount = 0.00;
                break;
        }
        System.out.println("You are a " + loyaltyMemberStatus + " member, and you have a discount of " + loyaltyMemberDiscount);


    }
}

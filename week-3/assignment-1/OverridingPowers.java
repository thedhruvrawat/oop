import java.io.*;
import java.util.*;

class Card {
    String name = "John Doe"; // card holder's name

    int credits = 0;

    static void welcome() {
        System.out.println("Hi, Card management in process...");
    }

    public void print() {
        System.out.println("This card belongs to " + name);
    }
}

class SilverCard extends Card {
    SilverCard(int amountPaid) {
        if (amountPaid < 2000 && amountPaid >= 1000) {
            this.credits += 5;
        } else if (amountPaid < 4000 && amountPaid >= 2000) {
            this.credits += 10;
        } else if (amountPaid < 10000 && amountPaid >= 4000) {
            this.credits += 15;
        } else if (amountPaid > 10000) {
            this.credits += 20;
        }
        /*
         * Implement the constructor to add additional credits for the card based on the
         * amount paid. Rs. 1000 - 1999 -> 5 additional credits Rs. 2000 - 3999 -> 10
         * additional credits Rs. 4000 - 9999 -> 15 additional credits More than Rs.
         * 10000 -> 20 additional credits
         */
    }

    /*
     * Create an overriden method for toString() to print the credits left in the
     * card along with the card holder's name.
     */

    public void print() {
        System.out.println("Credits left in the card: " + credits);
        System.out.println("This card belongs to " + name);
    }

    void deduct(int creditsSpent) {
        if (creditsSpent <= credits) {
            credits -= creditsSpent;
        } else {
            System.out.println("Insufficient balance");
        }
        /*
         * Instructions:
         * 
         * 1. If the number of credits spent is less than or equal to the number of
         * credits left, then proceed with the transaction and do the appropriate
         * updations. 2. Else, print an error message saying "Insufficient balance".
         */
    }
}

class GoldCard extends SilverCard {
    final int FREE_CREDITS = 10;

    GoldCard(int amountPaid) {
        super(amountPaid);
        credits += FREE_CREDITS;
        /*
         * Implement this constructor using the parent constructor with the additional
         * free Also use the free credits to increase your initial credits.
         */
    }

    /*
     * Implement a PRIVATE top-up method to add some credits to the account by
     * paying Rs. 500 for each top-up. Each top-up adds 5 credits to the card. Also
     * show the number of credits remaining in the card after the top-up.
     */
    private void topup() {
        credits += 5;
        System.out.println("Credits left in the card: " + credits);
    }

    public void deduct(int creditsSpent) {
        while (creditsSpent > credits) {
            topup();
            // System.out.println("Topping up");
        }
        if (creditsSpent <= credits) {
            credits -= creditsSpent;
            // System.out.println(" No Topping up");
        }
    }
    /*
     * Override the deduct method to decuct credits according to the following
     * logic:
     * 
     * 1. If the number of credits spent is less than or equal to the number of
     * credits left, then proceed with the transaction and do the appropriate
     * updations. 2. Else, top-up the the credits in the account using the top-up
     * method implemented above.
     */
}

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String[] Value = n.split(" ");
        String type = Value[0];
        int initial = Integer.parseInt(Value[1]);
        if (type.equals("Gold")) {
            GoldCard g1 = new GoldCard(initial);
            int p = s.nextInt();
            for (int i = 0; i < p; i++) {
                int k = s.nextInt();
                if (k == 1) {
                    g1.print();
                } else {
                    int tp = s.nextInt();
                    g1.deduct(tp);
                }
                // System.out.println("----------");
            }
        } else {
            SilverCard s1 = new SilverCard(initial);
            int q = s.nextInt();
            for (int i = 0; i < q; i++) {
                int k = s.nextInt();
                if (k == 1) {
                    s1.print();
                } else {
                    int tp = s.nextInt();
                    s1.deduct(tp);
                }
            }
        }

    }
}
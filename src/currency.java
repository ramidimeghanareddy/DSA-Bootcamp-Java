package src;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter input in INR:");
        double inr=input.nextDouble();
        double usd=(inr* 0.012);
        System.out.println("Your amount in USD is:"+usd);
    }
}

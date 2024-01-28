package src;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hey!, want to find the simple interest?");
        System.out.println("Enter the principal amount taken :");
        double amt=input.nextDouble();
        System.out.println("Enter the time(years) you have :");
        double time=input.nextDouble();
        System.out.println("Enter the rate(%) you agreed for:");
        double rate=input.nextDouble();
        double i=(amt*time*rate)/100;
        System.out.println("Interest you have to pay is:"+i);
    }
}

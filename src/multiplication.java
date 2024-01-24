package src;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to print multiplication table:");
        int number=input.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(number+" x"+i+" ="+(number*i));
        }
    }
}

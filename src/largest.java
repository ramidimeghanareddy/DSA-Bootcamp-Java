package src;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int l=0;
        if(num1>num2){
            l=num1;
        }else{
            l=num2;
        }
        System.out.println("Largest number is:"+l);
    }
}

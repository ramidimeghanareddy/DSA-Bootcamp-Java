package src;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=input.nextInt();
        int a=0,b=1;
        int sum;
        if(n<=0){
            System.out.println("Enter positive number");
        } else if (n==1) {
            System.out.println(a);
        }else{
            System.out.println(a);
            System.out.println(b);
            for(int i=0;i<n-2;i++){
                sum=a+b;
                a=b;
                b=sum;
                System.out.println(sum);
            }
        }
    }
}

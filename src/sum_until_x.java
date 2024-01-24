package src;

import java.util.Scanner;

import static java.lang.System.out;

public class sum_until_x {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int temp;
        String temps="";
        while(!temps.equals("x")){
            System.out.println("Enter numbers or x to quit:");
            temps=input.next();
            if(!temps.equals("x")) {
                temp=Integer.parseInt(temps);
                sum=sum+temp;
            }
        }
        System.out.println("Sum:" + sum);
    }
}

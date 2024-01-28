package src;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter operator (+, -, *, /, %):");
        String op=input.next();
        System.out.println("Enter two numbers:");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double res=0;
        if(op.equals("+")){
            res=num1+num2;
        } else if(op.equals("-")){
            res=num1-num2;
        } else if (op.equals("*")) {
            res=num1*num2;
        } else if (op.equals("/")) {
            res=num1/num2;
        } else if (op.equals("%")) {
            res=num1%num2;
        }else{
            System.out.println("Invalid Operator");
            System.out.println("Choose from (+, -, *, /, %):");
        }
        System.out.println("Result is:"+res);
    }
}

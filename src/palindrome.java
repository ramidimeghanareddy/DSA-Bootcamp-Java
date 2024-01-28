package src;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str,rev="";
        System.out.println("Enter a word:");
        str=input.nextLine();
        str=str.toLowerCase();
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str+" is a Palindrome.");
        }else{
            System.out.println(str+" is not a Palindrome.");
        }
    }
}

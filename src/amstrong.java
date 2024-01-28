package src;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int sum,rem=0,l=n1,s=n2;
        if(n2>n1){
            l=n2;
            s=n1;
        }
        for(int i=s;i<=l;i++){
            int j=i;sum=0;
            while (j>0){
                rem=j%10;
                sum=sum+(rem*rem*rem);
                j=j/10;
            }
            if(sum==i){
                System.out.print(i+", ");
            }
        }
    }
}

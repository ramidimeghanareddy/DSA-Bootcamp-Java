package src;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int avg=sum/n;
        System.out.println("Avg is:"+avg);
    }
}

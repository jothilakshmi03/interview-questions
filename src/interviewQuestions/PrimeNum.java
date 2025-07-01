package interviewQuestions;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Ending Number : ");
        int num= sc.nextInt();
        System.out.println("Prime Numbers from 1 to "+num+" are : ");
        primeNum(num);

    }
    public static void primeNum(int num){
        for(int i=2;i<=num;i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int j=2;j<=Math.sqrt(n);j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}

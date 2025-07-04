package interviewQuestions;

import java.util.Scanner;

public class ReplaceaCharAtindex {
    public static void main(String[] args) {
        String str="Geek for geeks";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index : ");
        int index=sc.nextInt();
        sc.nextLine();
        if (!Checklen(str, index)) {
            System.out.println("Invalid index!");
            return;
        }
        System.out.println(Checklen(str,index));
        System.out.println("Enter a new Character : ");
        char Character=sc.nextLine().charAt(0);
        System.out.println(replaceChar(str,index,Character));

    }
    public static String replaceChar(String str,int index,char Character){
       StringBuilder ch=new StringBuilder(str);
       ch.setCharAt(index,Character);

        return ch.toString();
    }
    public static boolean Checklen(String str,int index){
        int len=str.length();
        if(index>len-1||index<0){
            return false;
        }
        return true;
    }
}

package interviewQuestions;

public class VowelCheck {
    public static void main(String[] args) {
        String str="my name is jyothilakshmi";
        System.out.println(vowelcheck(str));
    }
    public static String vowelcheck(String str){
        StringBuilder str2=new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                str2.append(str.charAt(i));
            }
        }
        return str2.toString();
    }
}

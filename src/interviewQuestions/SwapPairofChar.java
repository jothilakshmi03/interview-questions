package interviewQuestions;

public class SwapPairofChar {
    public static void main(String[] args) {
        String str="avocado";
        System.out.println(swappingChar(str));
    }
    public static char[] swappingChar(String str){
        int len=str.length();
        char[] ch=str.toCharArray();
        for(int i=0;i<len-1;i+=2){
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
        }
        return ch;
    }
}

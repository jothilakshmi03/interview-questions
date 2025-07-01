package interviewQuestions;

public class SpaceCheck {
    public static void main(String[] args) {
        String str="i love you    ";
        System.out.println(spaceCheck(str));
    }
    public static int spaceCheck(String str){
        StringBuffer str2=new StringBuffer();
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==32){
                count++;
            }
        }
        return count;
    }
}

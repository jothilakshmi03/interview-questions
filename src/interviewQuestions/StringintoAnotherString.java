package interviewQuestions;

public class StringintoAnotherString {
    public static void main(String[] args) {
        String originalString="Greek Greeks";
        String StringtoBeInsert="for";
        System.out.println(stringInsertion(originalString,StringtoBeInsert));
    }
    public static String stringInsertion(String originalString, String StringtoBeInsert){
        StringBuilder str=new StringBuilder();
        int len=originalString.length()-1;
        for(int i=0;i<len;i++){
            char ch=originalString.charAt(i);
            str.append(ch);
            if(ch==' '){
                str.append(StringtoBeInsert);
                str.append(' ');
            }
        }
        return str.toString();
    }
}

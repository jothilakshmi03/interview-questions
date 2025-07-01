package interviewQuestions;

public class PrintingConsonants {
    public static void main(String[] args) {
        String str="jkshgzusrhgozu tnap nsueitua maeir";
        System.out.println(consonantsCheck(str));
    }
    public static String consonantsCheck(String str){
        StringBuilder str2=new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)!='a'&& str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u'){
                str2.append(str.charAt(i));

            }
        }
        return str2.toString();
    }
}

package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddLenString {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("pear");
        fruits.add("avocado");
//        System.out.println(fruits);
        int len=fruits.size();
        System.out.println(len);
        for(int i=0;i<len;i++){
            String check=fruits.get(i);
            if(check.length()%2==1){
                System.out.println(check);
            }
        }
    }

}

import java.util.ArrayList;
import java.util.Scanner;
public class CapitalLetterStart {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        String[] s=sc.nextLine().split("\\s+");
        ArrayList<String> arr=new ArrayList<String>();
        String ans="";
        for(String word:s){
            if(Character.isUpperCase(word.charAt(0))) arr.add(word);
        }

        for(String word:s){
            ans+=word.charAt(0);
        }

        arr.forEach(word->{
            System.out.println(word);
        });
        System.out.println(ans);
        sc.close();
    }
}

import java.util.*;
public class count_vowel {
    static boolean isvowel(char c){
        return c=='a' || c=='e' || c=='i'||c=='o' || c=='u';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        s=s.toLowerCase();
        int vowel=0,cons=0,digit=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                vowel++;
            }
            else if(Character.isDigit(s.charAt(i))) digit++;
            else cons++;
        }

        System.out.println(vowel+" "+cons+" "+digit);
        sc.close();
    }
}

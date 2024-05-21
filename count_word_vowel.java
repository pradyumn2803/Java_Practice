import java.util.Scanner;

public class count_word_vowel {
    static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] st=sc.nextLine().split("\\s+");
        int cnt=0;
        for(String word:st){
            if(isVowel(word.charAt(0))) cnt++;
        }
        System.out.println(cnt);
        sc.close();;
    }
}

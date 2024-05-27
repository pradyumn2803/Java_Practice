import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        String ch="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') ch+=s.charAt(i);
            else if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
                ch+=s.charAt(i);
            }
        }
        System.out.println(ch);
        sc.close();
    }
}

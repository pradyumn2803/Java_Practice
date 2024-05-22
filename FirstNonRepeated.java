import java.util.*;
public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==null) {
                mp.put(s.charAt(i),1);
                ans+=s.charAt(i);
            }
            else break;

        }
        System.out.println(ans);
        sc.close();
    }
}

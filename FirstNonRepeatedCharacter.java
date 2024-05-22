import java.util.*;
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==null){
                mp.put(s.charAt(i),1);
            }
            else{
                int cnt=mp.get(s.charAt(i));
                cnt++;
                mp.put(s.charAt(i),cnt);
            }
        }

        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){System.out.println(s.charAt(i));break;}
        }
        sc.close();
    }
}

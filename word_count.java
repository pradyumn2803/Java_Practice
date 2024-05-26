import java.util.*;
public class word_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();

        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(mp.containsKey(s.charAt(i))==true){
                    mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                }
                else{
                    mp.put(s.charAt(i),1);
                }
            }
        }
        HashMap<Character,Integer> mark=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(!mark.containsKey(s.charAt(i))){
                    mark.put(s.charAt(i),1);
                    System.out.printf("%c: %d\n",s.charAt(i),mp.get(s.charAt(i)));
                }
            }
        }
        sc.close();
    }
}

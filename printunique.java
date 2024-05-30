import java.util.*;
public class printunique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                System.out.print(s.charAt(i));
                map.put(s.charAt(i),1);
            }
        }
        sc.close();   
    }
}

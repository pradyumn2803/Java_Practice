import java.util.*;
public class lastChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split("\\s+");
        String ans="";
        for(int i=0;i<s.length;i++){
            ans+=s[i].charAt(s[i].length()-1);
        }
        System.out.println(ans);
        sc.close();
    }
}

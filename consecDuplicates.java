import java.util.*;
public class consecDuplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        ans+=s.charAt(0);
        char c=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=c){
                c=s.charAt(i);
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}

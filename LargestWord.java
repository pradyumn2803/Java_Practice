import java.util.*;
public class LargestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split("\\s+");
        String ans="";
        int maxi=0;
        for(int i=0;i<s.length;i++){
            if(maxi<s[i].length()){
                maxi=s[i].length();
                ans=s[i];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}

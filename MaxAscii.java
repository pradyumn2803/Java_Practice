import java.util.*;
public class MaxAscii {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int maxi=0;
        char ans=' ';
        for(int i=0;i<s.length();i++){
            if(maxi<s.charAt(i)){
                maxi=s.charAt(i);
                ans=s.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}

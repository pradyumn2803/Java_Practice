import java.util.*;
public class oddPositionConsonent {
    static int vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='u') return 1;
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();
        String ans="";
        st=st.toLowerCase();
        for(int i=0;i<st.length();i+=2){
            if((vowel(st.charAt(i))==0) && (st.charAt(i)!=' ')) ans+=st.charAt(i);
        }
        System.out.println(ans);
        sc.close();
    }
}

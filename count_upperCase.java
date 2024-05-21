import java.util.*;
public class count_upperCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int cnt=0;
        for(int i=0;i<st.length();i++){
            if(Character.isUpperCase(st.charAt(i))) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}

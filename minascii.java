import java.util.*;
public class minascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        char c=s.charAt(0);

        for(int i=1;i<s.length();i++){
            if(c>s.charAt(i)){
                c=s.charAt(i);
            }
        }
        System.out.println(c);

        sc.close();
    }
}

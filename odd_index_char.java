import java.util.*;
public class odd_index_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        for(int i=1;i<s.length();i+=2){
            System.out.print(s.charAt(i));
        }

        sc.close();
    }
}

import java.util.*;
public class reverseString {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=s.charAt(i)+reverse;
        }
        System.out.printf("%s",reverse);
        scanner.close();
    }
}

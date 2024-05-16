import java.util.Scanner;

public class str_arr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        // char[] ch=s.toCharArray(s);  1 way
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        System.out.println(ch[0]);
        scanner.close();
    }
}

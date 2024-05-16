
import java.util.Scanner;

public class count {
    public static void main(String[] args){
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();

        String str[]=s.split(" ");

        System.out.println(str.length);

        scanner.close();
    }
}

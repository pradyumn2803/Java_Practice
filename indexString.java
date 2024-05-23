import java.util.*;
public class indexString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        char c=sc.nextLine().charAt(0);
        int ind=s.indexOf(c);
        if(ind==-1) System.out.println("NA");
        else System.out.println(ind);
        sc.close();
    }
}
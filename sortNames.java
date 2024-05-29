import java.util.*;
public class sortNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] s=new String[3];
        for(int i=0;i<3;i++){
            s[i]=sc.nextLine();
        }

        Arrays.sort(s);
        for(String a:s) System.out.println(a);
        sc.close();
    }
}

import java.util.*;
public class mergeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(",");
        String[] add=sc.nextLine().split(",");
        
        for(int i=0;i<add.length;i++){
            s=Arrays.copyOf(s,s.length+1);
            s[s.length-1]=add[i];
        }

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
            if(i!=s.length-1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}

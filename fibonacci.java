import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int n=Integer.parseInt(sc.nextLine());
        int first=0,second=1;
        System.out.printf("%d %d",first,second);
        for(int i=2;i<n;i++){
            int third=first+second;
            System.out.printf(" %d",third);
            first=second;
            second=third;
        }
        sc.close();  
    }
}

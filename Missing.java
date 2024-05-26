import java.util.*;
public class Missing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split("\\s+");
        int maxi=0;
        int []arr=new int[s.length];

        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
            maxi=Math.max(maxi,arr[i]);
        }
        int map[]=new int[maxi+1];
        for(int i=1;i<=maxi;i++) map[i]=0;
        for(int i=0;i<arr.length;i++) map[arr[i]]=1;
        for(int i=1;i<=maxi;i++){
            if(map[i]==0)
            { 
                System.out.print(i);
                if(i!=maxi) System.out.print(" ");
            }
        }
        sc.close();
    }
}

import java.util.*;
public class Majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[] arr=new int[n];
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else mp.put(arr[i],1);
        }
        sc.nextLine();
        mp.forEach((key,val)->{
            if(val>(n/2)) System.out.println(key);
        });
        sc.close();
    }
}

import java.util.*;
public class primeinDiagonal {
    static boolean isPrime(int a){
        if(a<=1) return false;
        for(int i=2;i*i<=a;i++){
            if((a%i)==0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int [][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            String[] s=sc.nextLine().split("\\s+");
            for(int j=0;j<s.length;j++){
                arr[i][j]=Integer.parseInt(s[j]);
            }
        }
        int maxi=-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || (i+j)==n-1){
                    if(isPrime(arr[i][j])){ 
                        maxi=Math.max(maxi,arr[i][j]);
                    }    
                }
            }
        }

        System.out.println(maxi);
        sc.close();
    }
}

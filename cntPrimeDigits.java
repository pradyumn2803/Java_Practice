import java.util.*;
public class cntPrimeDigits {
    static int checkPrime(int num){
        int cnt=0;
        for(int i=2;i<num;i++){
            if((num%i)==0) cnt++;
        }
        if(cnt>0 || num==1) return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int a=n,cnt=0;
        HashSet<Integer> hs=new HashSet<Integer>();
        while(a>0){
            int d=a%10;
            if(checkPrime(d)==1){
                hs.add(d);
            }
            a/=10;
        }
        System.out.print(hs.size());

        sc.close();
    }
}

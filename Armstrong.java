import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int a=n,sum=0;
        while(a>0){
            int d=a%10;
            sum+=Math.pow(d,3);
            a/=10;
        }

        if(sum==n) System.out.println("Armstrong");
        else System.out.println("Not");

        sc.close();
    }
}

import java.util.*;
public class SumDigit {
    static int findSum(int num){
        int sum=0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int sum=0;

        while(num>9){
            num=findSum(num);
        }
        System.out.println(num);
        sc.close();
    }
}

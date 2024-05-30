import java.util.*;
public class addnumstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();

        int i=0,sum=0;
        while(i<arr.length){
            if(Character.isDigit(arr[i])){
                int num=0;
                while(i<arr.length && Character.isDigit(arr[i])){
                    num=num*10+(arr[i]-'0');
                    i++;
                }
                sum+=num;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}

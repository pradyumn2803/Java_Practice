import java.util.Scanner;
public class average_arr {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        int n=Integer.parseInt(scanner.nextLine());
        int [] arr=new int[n];
        int avg=0;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
            avg+=arr[i];
        }
        System.out.printf("The average is %d",avg/n);
        scanner.close();
    }
}

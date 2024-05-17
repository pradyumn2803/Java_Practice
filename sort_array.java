import java.util.Arrays;
import java.util.Scanner;

public class sort_array {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        scanner.close();
    }
}

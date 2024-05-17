import java.util.*;
public class smallest_arr_ele {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        int n=Integer.parseInt(scanner.nextLine());
        int [] arr=new int[n];
        int mini=(int)1e9;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        for(int i=0;i<n;i++){
            if(arr[i]<mini) mini=arr[i];
        }
        System.out.println("Minimum is :"+mini);
        scanner.close();
    }
}

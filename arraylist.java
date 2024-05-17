import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] arg){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int ele;
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for(int i=0;i<n;i++){
            ele=Integer.parseInt(scanner.nextLine());
            arr.add(ele);
            // arr.set(i,ele);
        }

        arr.forEach(num->{
            System.out.println(num);
        });

        for(int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }
        scanner.close();
    }
}

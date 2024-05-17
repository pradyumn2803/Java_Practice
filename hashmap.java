import java.util.HashMap;
import java.util.Scanner;
public class hashmap {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<String,Integer>();

        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String str=scanner.nextLine();
            int val=Integer.parseInt(scanner.nextLine());
            map.put(str,val);
        }
        System.out.println("Enter string to fetch from map: ");
        String strr=scanner.nextLine();
        System.out.println(map.get(strr)+" " + map.containsKey(strr));
        // if the key is not present then it will return null
        map.forEach((key,val)->{
            System.out.println(key+" "+val);
        });
        if(n==1){System.out.println(".()");}
        else if(n==2){System.out.println("");}

        scanner.close();
    }
}

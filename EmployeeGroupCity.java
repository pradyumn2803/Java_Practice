import java.util.*;

public class EmployeeGroupCity {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<String>> mp=new HashMap<>();
        for(int i=0;i<6;i++){
            String name=sc.nextLine();
            String city=sc.nextLine();
            if(!mp.containsKey(city)){
                ArrayList<String> arr=new ArrayList<>();
                arr.add(name);
                mp.put(city,arr);
            }
            else {
                ArrayList<String> arr=mp.get(city);
                arr.add(name);
                mp.put(city,arr);
            }
        }
        
        mp.forEach((key,val)->{
            System.out.print(key+":");
            for(int i=0;i<val.size();i++){
                System.out.print(val.get(i));
                if(i!=val.size()-1) System.out.print(",");
            }
            System.out.println();
        });
        sc.close();
    }
}

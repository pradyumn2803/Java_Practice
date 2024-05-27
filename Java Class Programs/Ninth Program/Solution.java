
import java.util.*;

public class Solution{
    static int findPriceForGivenBrand(Phone[] p,String brand){
        int sum=0;
        for(int i=0;i<p.length;i++){
            if(p[i].Getbrand().equalsIgnoreCase(brand)){
                sum+=p[i].Getprice();
            }
        }
        return sum;
    }

    static Phone[] getPhoneIdBasedOnOs(Phone[] p,String os){
        Phone[] ans=new Phone[0];

        for(int i=0;i<p.length;i++){
            if(p[i].Getos().equalsIgnoreCase(os) && p[i].Getprice()>=50000){
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=p[i];
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Phone[] p=new Phone[4];
        for(int i=0;i<4;i++){
            int pid=Integer.parseInt(sc.nextLine());
            String os=sc.nextLine();
            String brand=sc.nextLine();
            int pr=Integer.parseInt(sc.nextLine());

            p[i]=new Phone(pid,os,brand,pr);
        }

        String brand=sc.nextLine();
        String os=sc.nextLine();

        int sum=findPriceForGivenBrand(p, brand);
        if(sum==0) System.out.println("The Given brand is not available");
        else System.out.println(sum);

        Phone[] ans=getPhoneIdBasedOnOs(p, os);
        if((ans.length)==0) System.out.println("No os availabe in specified range");
        else {
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].GetphoneID());
            }
        }
        sc.close();
    }
}

class Phone{
    private int phoneID,price;
    private String os,brand;

    Phone(int phoneID,String os,String brand,int price){
        this.phoneID=phoneID;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }

    public int GetphoneID(){
        return this.phoneID;
    }

    public int Getprice(){
        return this.price;
    }

    public String Getos(){
        return this.os;
    }

    public String Getbrand(){
        return this.brand;
    }
}
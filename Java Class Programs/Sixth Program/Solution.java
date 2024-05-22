import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    static int [] getPriceByDisease(Medicine[]m,String disease){
        int [] ans=new int [0];

        for(int i=0;i<m.length;i++)
        {
            if(m[i].Getdisease().equalsIgnoreCase(disease)){
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=m[i].Getprice();
            }
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Medicine[] m=new Medicine[4];

        for(int i=0;i<4;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=Integer.parseInt(sc.nextLine());
            m[i]=new Medicine(a,b,c,d);
        }

        String disease=sc.nextLine();

        int [] ans=getPriceByDisease(m,disease);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

        sc.close();
    }
}

class Medicine{
    private String MedicineName,batch,disease;
    private int price;

    Medicine(String MedicineName,String batch,String disease,int price){
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }

    public String GetMedicineName(){
        return this.MedicineName;
    } 

    public String Getbbatch(){
        return this.batch;
    }

    public String Getdisease(){
        return this.disease;
    } 
    public int Getprice(){
        return this.price;
    }
}
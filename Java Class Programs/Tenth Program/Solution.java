import java.util.*;
public class Solution{
    static int findAvgVoyagesByPct(NavalVessel[] n,int percentage){
        int avg=0;
        int cnt=0;

        for(int i=0;i<n.length;i++){
            int percent=(n[i].GetCompleted()*100)/n[i].GetPlanned();
            if(percent>=percentage){
                avg+=n[i].GetCompleted();
                cnt++;
            }
        }
        return (avg/cnt);
    }
    static NavalVessel[] findVesselByGrade(String purpose,NavalVessel[] n){
        NavalVessel[] ans=new NavalVessel[0];
        for(int i=0;i<n.length;i++){
            if(n[i].GetPurpose().equals(purpose)){
                int percent=(n[i].GetCompleted()*100)/n[i].GetPlanned();
                if(percent==100){
                    n[i].SetClass("Star");
                }
                else if(percent>=80 && percent<=99){
                    n[i].SetClass("Leader");
                }
                else if(percent>=55 && percent<=79){
                    n[i].SetClass("Inspirer");
                }
                else {
                    n[i].SetClass("Striver");
                }
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=n[i];
            }
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        NavalVessel []n=new NavalVessel[4];

        for(int i=0;i<4;i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            int c=Integer.parseInt(sc.nextLine());
            int d=Integer.parseInt(sc.nextLine());
            String e=sc.nextLine();

            n[i]=new NavalVessel(a,b,c,d,e);
        }
        int percentage=Integer.parseInt(sc.nextLine());
        String purpose=sc.nextLine();

        int avg=findAvgVoyagesByPct(n, percentage);
        System.out.println(avg);
        NavalVessel[] ans=findVesselByGrade(purpose, n);
        if(ans.length==0) System.out.println("No Naval Vessel is availabe with specified purpose");
        else {
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].GetName()+"%"+ans[i].GetClass());
            }
        }
        sc.close();
    }
}

class NavalVessel{
    private int vesselId,noOfVoyagesPlanned,noOfVoyagesCompleted;
    private String vesselName,purpose,classification;

    NavalVessel(int vesselId,String vesselName,int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose){
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.purpose=purpose;
    }

    public int GetId(){
        return this.vesselId;
    }
    public String GetName(){
        return this.vesselName;
    }
    public int GetPlanned(){
        return this.noOfVoyagesPlanned;
    }
    public int GetCompleted(){
        return this.noOfVoyagesCompleted;
    }
    public String GetPurpose(){
        return this.purpose;
    }
    public String GetClass(){
        return this.classification;
    }
    public void SetClass(String classification){
        this.classification=classification;
    }
}
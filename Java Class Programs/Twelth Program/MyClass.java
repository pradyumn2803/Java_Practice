import java.util.*;
public class MyClass{
    static int searchAntennaByName(Antenna[] a,String name){
        for(int i=0;i<a.length;i++){
            if(a[i].GetantennaName().equalsIgnoreCase(name)){
                return a[i].Getantennaid();
            }
        }
        return 0;
    }

    static Antenna[] sortAntennaByVSWR(Antenna[] a,double vswr){
        Antenna[] ans=new Antenna[0];
        for(int i=0;i<a.length;i++){
            if(a[i].GetantennaVSWR()<vswr){
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=a[i];
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].GetantennaVSWR()>ans[j+1].GetantennaVSWR()){
                    Antenna temp=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Antenna a[]=new Antenna[4];

        for(int i=0;i<4;i++){
            int z=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=Double.parseDouble(sc.nextLine());
            a[i]=new Antenna(z,b,c,d);
        }

        String name=sc.nextLine();
        double vswr=Double.parseDouble(sc.nextLine());
        
        int id=searchAntennaByName(a,name);
        
        if(id==0) System.out.println("There is not antenna with given id");
        else System.out.println(id);

        Antenna[] ans=sortAntennaByVSWR(a,vswr);
        if(ans.length==0) System.out.println("No Antenna found");
        else{
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].GetprojectLead());
            }
        }
        sc.close();
    }
}

class Antenna{
    private int antennaid;
    private String antennaName,projectLead;
    private double antennaVSWR;

    Antenna(int antennaid,String antennaName,String projectLead,double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }

    public int Getantennaid(){
        return this.antennaid;
    }

    public String GetantennaName(){
        return this.antennaName;
    }

    public String GetprojectLead(){
        return this.projectLead;
    }

    public double GetantennaVSWR(){
        return this.antennaVSWR;
    }

}
import java.util.*;
public class Solution{
    static int findTestPassedByEnv(AutonomousCar[] ac,String environment){
        int sum=0;

        for(int i=0;i<ac.length;i++){
            if(ac[i].Getenvironment().equalsIgnoreCase(environment)){
                sum+=ac[i].GetTestPassed();
            }
        }
        return sum;
    }

    static AutonomousCar[] updateCarGrade(AutonomousCar[] ac,String brand){
        AutonomousCar[] ans=new AutonomousCar[0];

        for(int i=0;i<ac.length;i++){
            if(ac[i].Getbrand().equalsIgnoreCase(brand)){
                int grade=(ac[i].GetTestPassed()*100)/ac[i].GetTestConducted();
                if(grade>=80) ac[i].SetGrade("A1");
                else ac[i].SetGrade("B2");
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=ac[i];
            }
        }
        return (ans.length==0)?null:ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        AutonomousCar[] ac=new AutonomousCar[4];

        for(int i=0;i<4;i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            int c=Integer.parseInt(sc.nextLine());
            int d=Integer.parseInt(sc.nextLine());
            String e=sc.nextLine();
            ac[i]=new AutonomousCar(a,b,c,d,e);
        }

        String env=sc.nextLine();
        String brand=sc.nextLine();

        System.out.println(findTestPassedByEnv(ac, env));
        AutonomousCar [] ans=updateCarGrade(ac, brand);
        if(ans==null) System.out.println("No car availabe");
        else{
            for(int i=0;i<ans.length;i++){
                System.out.printf("%s::%s\n",ans[i].Getbrand(),ans[i].GetGrade());
            }
        }

        sc.close();
    }
}

class AutonomousCar{
    private int cardid,noOfTestConducted,noOfTestsPassed;
    private String brand,environment,grade;


    AutonomousCar(int cardid,String brand,int noOfTestsConducted,int noOfTestPassed,String environment){
        this.cardid=cardid;
        this.brand=brand;
        this.noOfTestConducted=noOfTestsConducted;
        this.noOfTestsPassed=noOfTestPassed;
        this.environment=environment;
    }

    public int Getcarid(){
        return this.cardid;
    }
    public int GetTestPassed(){
        return this.noOfTestsPassed;
    }
    public int GetTestConducted(){
        return this.noOfTestConducted;
    }
    public String Getbrand(){
        return this.brand;
    }
    public String Getenvironment(){
        return this.environment;
    }
    public String GetGrade(){
        return this.grade;
    }

    public void SetGrade(String grade){
        this.grade=grade;
    }

}
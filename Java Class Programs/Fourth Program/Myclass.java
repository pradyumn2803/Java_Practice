import java.util.*;
public class Myclass{
    public static int findCountOfEmployeesUsingCompTransport(Employee[] emp,String branch){
        int cnt=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].Getbranch().equalsIgnoreCase(branch)){
                if(emp[i].Gettransport()==true) cnt++;
            }
        }
        return cnt;
    }
    public static Employee[] findEmployeeWithSecondHighestRating(Employee[] emp){
        Employee[] ans=new Employee[0];

        double maxi=0,maxi_second=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].Gettransport()==false){
                maxi=Math.max(maxi,emp[i].GetRating());
            }
        }

        for(int i=0;i<emp.length;i++){
            if(emp[i].Gettransport()==false && emp[i].GetRating()<maxi && emp[i].GetRating()>maxi_second) maxi_second=emp[i].GetRating();
        }

        for(int i=0;i<emp.length;i++){
            if(emp[i].GetRating()==maxi_second){
                if(emp[i].Gettransport()==false){
                    ans=Arrays.copyOf(ans,ans.length+1);
                    ans[ans.length-1]=emp[i];
                }
            }
        }

        return (ans.length==0)?null:ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Employee[] emp= new Employee[4];
        for(int i=0;i<4;i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=Double.parseDouble(sc.nextLine());
            boolean e=Boolean.parseBoolean(sc.nextLine());
            emp[i]=new Employee(a,b,c,d,e);
        }
        String branch=sc.nextLine();
        int cnt=findCountOfEmployeesUsingCompTransport(emp,branch);
        Employee ans[]=findEmployeeWithSecondHighestRating(emp);
        if(cnt==0) System.out.println("Nothing");
        else System.out.println(cnt);
        if(ans==null) System.out.println("No records");
        else {
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].GetId()+"\n"+ans[i].GetName());
            }
        }
        sc.close();
    }
}

class Employee{
    private int EmployeeId;
    private String name,branch;
    private double rating;
    private boolean transport;

    Employee(int EmployeeId,String name,String branch,double rating,boolean transport){
        this.EmployeeId=EmployeeId;
        this.name=name;
        this.branch=branch;
        this.rating=rating;
        this.transport=transport;
    }

    public int GetId(){
        return this.EmployeeId;
    }
    public String GetName(){
        return this.name;
    }
    public String Getbranch(){
        return this.branch;
    }
    public double GetRating(){
        return this.rating;
    }
    public boolean Gettransport(){
        return this.transport;
    }

}
package Second_Program;
import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the company name: ");
        String companyName=sc.nextLine();
        System.out.print("Enter the number of Employees: ");
        int n=Integer.parseInt(sc.nextLine());
        
        Employee[] emp=new Employee[n];
        System.out.println("Enter Employee Details:");

        for(int i=0;i<n;i++){
            System.out.println("Employee "+(i+1));
            System.out.print("Enter id: ");
            int id=Integer.parseInt(sc.nextLine());
            System.out.print("Enter name: ");
            String name=sc.nextLine();
            System.out.print("Enter designation: ");
            String designation=sc.nextLine();
            System.out.print("Enter salary: ");
            int sal=Integer.parseInt(sc.nextLine());
            emp[i]=new Employee(id,name,designation,sal);
        }

        Company company=new Company();
        System.out.println("Average Salary: "+company.getAveragesalary(emp));
        System.out.println("Max Salary: "+company.getMaxsalary(emp));
        System.out.print("Employees with designation: ");
        String desig=sc.nextLine();
        Employee [] ans=company.getEmployeesByDesignation(emp, desig);

        for(int i=0;i<ans.length;i++){
            System.out.printf("ID: %d, Name:%s, Designation:%s, Salary: %f\n",ans[i].getID(),ans[i].getEmployee(),ans[i].getDesignation(),ans[i].getSalary());
        }

        sc.close();
    }
}
class Company{  
    private String companyName;
    private Employee[] employee;
    private int numEmployees;

    double getAveragesalary(Employee emp[]){
        int sum=0;
        for(int i=0;i<emp.length;i++){
            sum+=emp[i].getSalary();
        }
        return sum/(emp.length);
    }

    double getMaxsalary(Employee emp[]){
        double maxi=0;
        for(int i=0;i<emp.length;i++){
            maxi=Math.max(maxi,emp[i].getSalary());
        }
        return maxi;
    }

    Employee[] getEmployeesByDesignation(Employee[] emp,String designation){
        int cnt=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].getDesignation().equals(designation)) cnt++;
        }
        Employee [] ans=new Employee[cnt];
        int k=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].getDesignation().equals(designation)){
                ans[k]=emp[i];
                k++;
            }
        }

        return ans;
    }
}

class Employee{
    private int id;
    private double salary;
    private String name;
    private String designation;

    Employee(int id,String name,String designation,double salary){
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getID(){
        return this.id;
    }

    public String getDesignation(){
        return this.designation;
    }

    public String getEmployee(){
        return this.name;
    }
}




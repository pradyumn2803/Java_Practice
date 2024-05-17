import java.util.*;
public class Solution{
    public static Employee[] getEmployeeWithSecondLowestSalary(Employee[] emp){
        if(emp.length<=1) return null;
        double maxi=0.0,secondmax=0.0;
        int cnt=0,k=0;
        for(int i=0;i<emp.length;i++){
            maxi=Math.max(maxi,emp[i].GetempSalary());
        }
        
        for(int i=0;i<emp.length;i++){
            if(emp[i].GetempSalary()>secondmax && emp[i].GetempSalary()<maxi){
                secondmax=emp[i].GetempSalary();     
            }
        }
        
        Employee[] ans=new Employee[0];
        // for(int i=0;i<emp.length;i++){
        //     if(emp[i].GetempSalary()==secondmax){
        //         cnt++;  
        //     }
        // }
        // for(int i=0;i<emp.length;i++){
        //     if(emp[i].GetempSalary()==secondmax){
        //        ans[k]=emp[i];
        //        k++;
        //     }
        // }
        for(int i=0;i<emp.length;i++){
            if(emp[i].GetempSalary()==secondmax){
                ans=Arrays.copyOf(ans,ans.length+1);
               ans[k]=emp[i];
               k++;
            }
        }
        return ans;
    }

    public static int countEmployeesBasedOnAge(Employee[] emp,int Age){
        int cnt=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].GetempAge()==Age) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Employee[] employee=new Employee[n];
        for(int i=0;i<n;i++){
            int employeeId=Integer.parseInt(scanner.nextLine());
            String employeeName=scanner.nextLine();
            int age=Integer.parseInt(scanner.nextLine());
            char gender=scanner.next().charAt(0);
            scanner.nextLine();
            double salary=Double.parseDouble(scanner.nextLine());
            employee[i]=new Employee(employeeId,employeeName,age,gender,salary);
        }
        int age=Integer.parseInt(scanner.nextLine());
        Employee ans[]=getEmployeeWithSecondLowestSalary(employee);
        if(ans==null) System.out.println("null");
        else {
            for(int i=0;i<ans.length;i++){
                System.out.printf("%d#%s\n",ans[i].GetempID(),ans[i].GetempName());
            }
        }
        System.out.println(countEmployeesBasedOnAge(employee, age));
        scanner.close();
    }
}
public class Employee {
    private int employeeId,age;
    private String employeeName;
    private char gender;
    private double salary;

    public Employee(int employeeId,String employeeName,int age,char gender,double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    public int GetempID(){
        return this.employeeId;
    }
    public String GetempName(){
        return this.employeeName;
    }
    public int GetempAge(){
        return this.age;
    }
    public char GetempGender(){
        return this.gender;
    }
    public double GetempSalary(){
        return this.salary;
    }
}

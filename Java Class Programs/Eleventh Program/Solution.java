import java.util.*;
public class Solution{
    static Student[] findStudentByGradeAndMonth(Student[] s,char grade,int month){
        Student[] ans=new Student[0];

        for(int i=0;i<s.length;i++){
            if(s[i].Getgrade()==grade){
                String st[]=s[i].Getdate().split("/");
                int checkmonth=Integer.parseInt(st[1]);

                if(checkmonth==month){
                    ans=Arrays.copyOf(ans,ans.length+1);
                    ans[ans.length-1]=s[i];
                }
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j].GetrollNo()>ans[j+1].GetrollNo()){
                    Student temp=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student[] s=new Student[4];
        for(int i=0;i<4;i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            String c=sc.nextLine();
            char d=sc.nextLine().charAt(0);
            String e=sc.nextLine();
            s[i]=new Student(a,b,c,d,e);
        }
        char ch=sc.nextLine().charAt(0);
        int num=Integer.parseInt(sc.nextLine());
        Student[] ans=findStudentByGradeAndMonth(s,ch,num);
        if(ans.length==0) System.out.println("No records Found");
        else{
            for(int i=0;i<ans.length;i++){
                System.out.printf("%s\n%s\n",ans[i].Getname(),ans[i].Getsubject());
            }
            System.out.println(ans.length);
        }
        sc.close();
    }
}

class Student{
    private int rollNo;
    private String name,subject,date;
    private char grade;

    Student(int rollNo,String name,String subject,char grade,String date){
        this.name=name;
        this.subject=subject;
        this.grade=grade;
        this.date=date;
    }

    public int GetrollNo(){
        return this.rollNo;
    }

    public String Getname(){
        return this.name;
    }

    public String Getsubject(){
        return this.subject;
    }

    public char Getgrade(){
        return this.grade;
    }

    public String Getdate(){
        return this.date;
    }
}
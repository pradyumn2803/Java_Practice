import java.util.*;
public class courseProgram{
    static int findAvgOfQuizByAdmin(Course c[],String value){
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(c[i].getAdmin().equals(value)){
                sum+=c[i].getQuiz();
            }
        }
        return (sum/(c.length));
    }
    static Course[] sortCourseByHandsOn(Course c[],int value){
        Course[] ans=new Course[0];
        for(int i=0;i<c.length;i++){
            if(c[i].getHandson()<value){
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=c[i];
            }
        }
        return (ans.length==0)?null:ans;
    }
    public static void main(String[] args){
        // Course course=new Course();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Course[] course=new Course[n];
        for(int i=0;i<n;i++){
            int cid=Integer.parseInt(sc.nextLine());
            String cname=sc.nextLine();
            String cadmin=sc.nextLine();
            int quiz=Integer.parseInt(sc.nextLine());
            int handson=Integer.parseInt(sc.nextLine());
            
            course[i]=new Course(cid,cname,cadmin,quiz,handson);
        }
        String st=sc.nextLine();
        int val=Integer.parseInt(sc.nextLine());
        int avg=findAvgOfQuizByAdmin(course, st);
        if(avg==0){
            System.out.println("No Course Found");
        }
        else System.out.println(avg);
        Course[] ans=sortCourseByHandsOn(course, val);

        if(ans==null) System.out.println("No Course found with mentioned attributes");
        else{
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].getName());
            }
        }
        sc.close();
    }
} 

class Course{
    private int courseId,quiz,handson;
    private String courseName,courseAdmin;

    Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseAdmin=courseAdmin;
        this.quiz=quiz;
        this.handson=handson;
    }

    public int getID() {
        return this.courseId;
    }

    public String getName(){
        return this.courseName;
    }

    public String getAdmin(){
        return this.courseAdmin;
    }

    public int getQuiz(){
        return this.quiz;
    }

    public int getHandson(){
        return this.handson;
    }

    public void setID(int Id) {
        this.courseId=Id;;
    }

    public void setName(String name){
         this.courseName=name;
    }

    public void setAdmin(String admin){
         this.courseAdmin=admin;
    }

    public void setQuiz(int quiz){
         this.quiz=quiz;
    }

    public void setHandson(int handson){
         this.handson=handson;
    }

}
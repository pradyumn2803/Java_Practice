
import java.util.*;

public class Solution{
    static int findPointsForGivenSkill(Player[] p,String skill){
        int sum=0;
        for(int i=0;i<p.length;i++){
            if(p[i].Getskill().equalsIgnoreCase(skill)){
                sum+=p[i].Getpoints();
            }
        }
        return sum;
    }

    static Player[] getPlayerBasedOnLevel(String level,String skill,Player[] p){
        Player[] ans=new Player[0];

        for(int i=0;i<p.length;i++){
            if(p[i].Getlevel().equalsIgnoreCase(level) && 
                p[i].Getskill().equalsIgnoreCase(skill) && p[i].Getpoints()>=20){
                    ans=Arrays.copyOf(ans,ans.length+1);
                    ans[ans.length-1]=p[i];
                }
        }

        return (ans==null)?null:ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Player[] p=new Player[4];

        for(int i=0;i<4;i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=Integer.parseInt(sc.nextLine());

            p[i]=new Player(a,b,c,d);
        }

        String skill=sc.nextLine();
        String level=sc.nextLine();

        int sum=findPointsForGivenSkill(p, skill);
        if(sum==0) System.out.println("The given Skill is not available");
        else System.out.println(sum);

        Player [] ans=getPlayerBasedOnLevel(level, skill, p);
        if(ans==null) System.out.println("No player is availabe with specified level,skill and eligibility points");
        else{
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].GetPlayerId());
            }
        }
        sc.close();
    }
}

class Player{
    private int PlayerId,points;
    private String skill,level;

    Player(int playerId,String skill,String level,int points){
        this.PlayerId=playerId;
        this.skill=skill;
        this.level=level;
        this.points=points;
    }

    public int GetPlayerId(){
        return this.PlayerId;
    }
    public int Getpoints(){
        return this.points;
    }
    public String Getskill(){
        return this.skill;
    }
    public String Getlevel(){
        return this.level;
    }
}
import java.util.*;
public class Solution{
    static Movie[] getMovieByGenre(Movie[] m,String genre){
        Movie[] ans=new Movie[0];
        for(int i=0;i<m.length;i++){
            if(m[i].GetGenre().equalsIgnoreCase(genre)){
                ans=Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=m[i];
            }
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Movie[] m=new Movie[4];

        for(int i=0;i<4;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=Integer.parseInt(sc.nextLine());
            m[i]=new Movie(a,b,c,d);
        }
        String genre=sc.nextLine();
        Movie[] ans=getMovieByGenre(m,genre);
        for(int i=0;i<ans.length;i++){
            if(ans[i].GetBudget()>80000000){
                System.out.println("High Budget Movie");
            }
            else System.out.println("Low Budget Movie");
        }
        sc.close();
    }
}

class Movie{
    private String movieName,company,genre;
    private int budget;

    Movie(String movieName,String company,String genre,int budget){
        this.movieName=movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }

    public String GetmovieName(){
        return this.movieName;
    }

    public String GetCompany(){
        return this.company;
    }

    public String GetGenre(){
        return this.genre;
    }

    public int GetBudget(){
        return this.budget;
    }
}
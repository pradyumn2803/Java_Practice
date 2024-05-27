import java.util.*;
public class RepeatString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        ArrayList<String> str=new ArrayList<>();

        int i=0,sum=0,cnt=0;
        String st="";
        while(i<s.length()){
            if(i<s.length() && Character.isLetter(s.charAt(i))){
                st="";
                while(i<s.length() && Character.isLetter(s.charAt(i))){
                    st+=s.charAt(i);
                    i++;
                }
                cnt++;
                str.add(st);
            }
            else if(i<s.length() && Character.isDigit(s.charAt(i))){
                st="";
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    st+=s.charAt(i);
                    i++;
                }
                cnt++;
                sum+=cnt;
                str.add(st);
            }
            else if(i<s.length()){
                st="";
                while(i<s.length() && !Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))){
                    st+=s.charAt(i);
                    i++;
                }
                cnt++;
                str.add(st);
            }
        }

        String ans=str.toString();
        System.out.print("Array is: "+ans);
        System.out.println();
        i=0;
        System.out.println(sum);
        while(i<sum){
            System.out.print(s);
            i++;
        }

        sc.close();
    }
}

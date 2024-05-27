import java.util.*;
public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int i=0;
        char ch=' ';

        while(i<s.length()){
            if(Character.isLetter(s.charAt(i))){
                ch=s.charAt(i);
                i++;
            }
            else{
                String st="";
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    st+=s.charAt(i);
                    i++;
                }

                int rep=Integer.parseInt(st);

                while(rep>0){
                    System.out.print(ch);
                    rep--;
                }
            }
        }
        sc.close();
    }
}

import java.util.*;
public class consecutiveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();

        char vowel[]={'a','e','i','o','u'};

        String [] s=st.split("\\s+");

        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length()-1;j++){
                boolean flag=false,flag2=false;
                for(int k=0;k<5;k++){
                    if(s[i].charAt(j)==(vowel[k])) flag=true;
                    if(s[i].charAt(j+1)==vowel[k]) flag2=true;
                }
                if(flag && flag2) System.out.printf("%s ",s[i]);
            }
        }

        sc.close();
    }
}

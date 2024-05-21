/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */
import java.util.*;
public class find_count_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] arr=sc.nextLine().split("\\s+");
        String find=sc.nextLine();
        int cnt=0;
        for (int i = 0; i < arr.length; i++)
        {
            String ch="";
            for (int j = 0; j < arr[i].length(); j++) 
            {
                if(Character.isLetter(arr[i].charAt(j)))
                {
                    ch = ch + arr[i].charAt(j);
                }
            }
            if(ch.equals(find)) cnt++;
        }
        
        System.out.println(cnt);
        sc.close();   
    }
}

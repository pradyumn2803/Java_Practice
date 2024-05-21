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

        String[] st=sc.nextLine().split("\\s+");
        HashSet<String> s=new HashSet<>();
        for(String word:st){
            if(Character.toLowerCase(word.charAt(word.length()-1))>='a' && Character.toLowerCase(word.charAt(word.length()-1))<='z'){
                s.add(word);
                continue;
            }
            else {
                word=word.substring(0,word.length()-1);
                s.add(word);
            }
        }
        System.out.println(s.size());
        sc.close();   
    }
    // for (int i = 0; i < arr.length; i++)
    //     {
    //         for (int j = 0; j < arr[i].length(); j++) 
    //         {
    //             if(Character.isLetter(arr[i].charAt(j)))
    //             {
    //                 ch = ch + arr[i].charAt(j);
    //             }
    //         }
    //      }
}

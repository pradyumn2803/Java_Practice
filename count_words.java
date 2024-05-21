import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     String[] st=sc.nextLine().split("\\s+");
     System.out.println(st.length);

     sc.close();
    }
}

import java.util.*;

public class add {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());

        System.out.println(a + b);
        scanner.close();
    }
}
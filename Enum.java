public class Enum {
    enum e{a,b,c};
    public static void main(String[] args) {
        for(e val:e.values()) System.out.println(val);
    }
}

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String arg[]){
        HashSet<Integer> hehe = new HashSet<>();
        hehe.add(1);
        hehe.add(2);
        hehe.add(1);
        hehe.add(3);
        for (int a:hehe
             ) {
            System.out.println(a);
        }
    }
}

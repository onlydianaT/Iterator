import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 100);
        Iterator iterator = randoms.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 100);
        Iterator iterator = randoms.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(100)) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
            System.out.println(iterator.next());
        }
    }
}


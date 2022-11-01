import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;
    int randomNumber;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            while (true) {
                int num = new Random().nextInt((max - min) + 1) + min;
                if (num == max) {
                    randomNumber = num;
                    System.out.println("Выпало число 100, давайте на этом закончим");
                    break;
                }
                randomNumber = num;
                return randomNumber;
            }
            return randomNumber;
        }
    }
}
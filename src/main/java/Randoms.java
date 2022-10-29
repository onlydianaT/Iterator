import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;
    protected List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        while (true) {
            int num = new Random().nextInt((max - min) + 1) + min;
            if (num == max) {
                list.add(num);
                break;
            }
            list.add(num);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            return list.get(index++);
        }
    }
}
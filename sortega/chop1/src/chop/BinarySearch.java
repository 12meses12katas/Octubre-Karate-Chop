package chop;

public class BinarySearch {
    public static int find(int value, int[] sorted) {
        return new Chop(sorted).indexOf(value);
    }

    private static class Chop {

        private final int[] sorted;
        private final int from;
        private final int to;

        public Chop(int[] sorted) {
            this(sorted, 0, sorted.length);
        }

        public Chop(int[] sorted, int from, int to) {
            this.sorted = sorted;
            this.from = from;
            this.to = to;
        }

        public int indexOf(int value) {
            if (this.isEmpty())
                return -1;

            int middle = from + size() / 2;
            if (value == sorted[middle])
                return middle;
            else if (value < sorted[middle])
                return new Chop(sorted, from, middle).indexOf(value);
            else
                return new Chop(sorted, middle+1, to).indexOf(value);
        }

        private int size() {
            return to - from;
        }

        private boolean isEmpty() {
            return to <= from;
        }
    }
}

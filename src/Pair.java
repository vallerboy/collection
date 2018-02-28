public class Pair<S, T> {
    private S first;
    private T last;

    public Pair(S first, T last) {
        this.first = first;
        this.last = last;
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }
}

package generic;

public class MinMax<C> {
    private C min;
    private C max;

    public MinMax(C min, C max) {
        this.min = min;
        this.max = max;
    }

    public C getMin() {
        return min;
    }

    public C getMax() {
        return max;
    }
}

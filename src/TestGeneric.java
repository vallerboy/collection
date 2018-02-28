public class TestGeneric {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("asd", 5);
        System.out.println(pair.getFirst() + " : " + pair.getLast());
    }
}

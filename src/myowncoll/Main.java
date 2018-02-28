package myowncoll;

public class Main {
    public static void main(String[] args) {

        SimpleArrayList<Integer> integerSimpleArrayList = new SimpleArrayList<>();
        integerSimpleArrayList.add(5);
        integerSimpleArrayList.add(20);
        integerSimpleArrayList.add(1);
        integerSimpleArrayList.add(5);
        integerSimpleArrayList.add(5);
        integerSimpleArrayList.add(0);

        integerSimpleArrayList.remove(1);
        integerSimpleArrayList.remove(0);

        integerSimpleArrayList.printList();
    }
}

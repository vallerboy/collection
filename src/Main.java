import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfNames1 = new LinkedList<>();

        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listOfNames1.add( "a" + i);
        }
        long timeStop1 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (timeStop1-timeStart1));


        List<String> listOfNames = new ArrayList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listOfNames.add( "a" + i);
        }
        long timeStop = System.currentTimeMillis();
        System.out.println("ArrayList: " + (timeStop-timeStart));



    }
}

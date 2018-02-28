import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> trans = new LinkedHashMap<>();
        trans.put("pies", "dog");
        trans.put("kot", "cat");

        //klucze
        for (String s : trans.keySet()) {
            System.out.println(s);
        }

        //wartosci
        for (String s : trans.values()) {
            System.out.println(s);
        }

        // klucze i wartosci
        for (Map.Entry<String, String> stringStringEntry : trans.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }

        System.out.println(trans.get("dog"));
    }


    public static boolean checkForDoubles(List<String> list){
        Iterator<String> iteratorObject  = list.iterator();
        while (iteratorObject.hasNext()){
            String s = iteratorObject.next();
            iteratorObject.remove();
            if(list.contains(s)){
                return true;
            }
        }
        return false;
    }
}

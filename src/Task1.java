import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = Collections.synchronizedList(new LinkedList<>());
        stringList.add("asd");
       // stringList.add("asd");
        stringList.add("asdasd");
        stringList.add("asdasdsad");
        stringList.add("asdasdsadsdadsad");

        System.out.println(checkForDoubles(stringList));
    }


    public static boolean checkForDoubles(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            iterator.remove();
            if(list.contains(s)){
                return true;
            }
        }
        return false;
    }
}

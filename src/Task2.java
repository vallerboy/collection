
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Oskar", "Damian",
                "Kacper", "Tomek", "Oskar", "Oskar", "Damian");



        checkList(Arrays.asList("Oskar", "Damian",
                "Kacper", "Tomek", "Oskar", "Oskar", "Damian"));
    }

    private static void checkList(List<String> names) {
        Map<String, Integer> occu = new HashMap<>();


        for (String name : names) {
            if(occu.containsKey(name)){
                occu.replace(name, occu.get(name) + 1);
            }else{
                occu.put(name, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : occu.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

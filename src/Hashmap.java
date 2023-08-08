import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> num = new HashMap<>();

        num.put("one",1);
        num.put("two",2);
        num.put("three",3);

//        if (num.containsKey("two")) {
//            num.put("two",23);
//        }
       // num.put("two",23);

        System.out.println(num);

        for (Map.Entry<String,Integer> e: num.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());

            System.out.println(e.getValue());
        }


    }
}

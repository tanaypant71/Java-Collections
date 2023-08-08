// The Collections framework is defined in the java.util package
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i)+" ");
        }

        for(Integer element: list)
        {
            System.out.println(element);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }



//        list.set(2,1000);
//        System.out.println(list); //O(1) time complexity
//
//        System.out.println(list.contains(2));

        //        List<Integer> newList = new ArrayList<>();
//        newList.add(12);
//        newList.add(14);
//        list.addAll(newList);
//        System.out.println(list);

        //System.out.println(list.get(2));

//        list.remove(2);
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(12));
//        System.out.println(list);
//
//        list.clear();
//        System.out.println(list);

        //Time Complexity
        //remove : O(n)
        //insert : O(n)

    }
}

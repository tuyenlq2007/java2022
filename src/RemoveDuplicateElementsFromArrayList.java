import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {
    public static void main (String[] args) {
        List<String> arraylist = new ArrayList<>(Arrays.asList("a","b","a"));
        Set<String> set = new HashSet(arraylist);
        for (String ele:set){
            System.out.println(ele);
        }

        List<String> newList = arraylist.stream().distinct().collect(Collectors.toList());
        for (String ele:newList){
            System.out.println(ele);
        }
    }

}

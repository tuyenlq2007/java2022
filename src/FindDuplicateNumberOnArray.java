import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FindDuplicateNumberOnArray {
    public static void main(String[] args) {
        /*Calling stream() method on the list to get a stream of values from the list
        filter() method is an intermediate operation of the Stream interface that allows us to filter elements of a stream that match a given Predicate:
        Collectors.toList() can be used for collecting all Stream elements into a List instance*/
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1));
        List<Integer> dupxlist = new ArrayList<>();
        list.forEach(el->{
            List<Integer> newlist = list.stream().filter(e->e==el).collect(toList());;
            if ((newlist.size() > 1)&&(!dupxlist.contains(el))) {
                dupxlist.add(el);
            }
        });
        dupxlist.forEach(System.out::println);
    }
}

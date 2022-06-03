import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargestAndSmallestNumberInUnsortedArray {
    public static void main(String[] args) {
        /*Calling stream() method on the list to get a stream of values from the list
        Calling mapToInt(value -> value) on the stream to get an Integer Stream
        Calling max() method on the stream to get the max value
        Calling orElseThrow() to throw an exception if no value is received from max()*/

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,3,4,5));
        Integer max = list.stream().mapToInt(v->v).max().orElseThrow();
        Integer min = list.stream().mapToInt(v->v).min().orElseThrow();
        System.out.println(max);
        System.out.println(min);
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateNumberOnArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1));
        list.forEach(el->{
            List<Integer> newlist = list.stream().filter(e->e==el).collect(Collectors.toList());;
            if (newlist.size() > 1)System.out.println(el);
        });

    }
}

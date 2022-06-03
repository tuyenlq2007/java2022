import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeArrayInAlternatingPositiveAndNegativeNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-1,1,-2,1,3,-4));
        List<Integer> soretedlist = list.stream().sorted().collect(Collectors.toList());
        //soretedlist.forEach(System.out::println);
        List<Integer> alterList = new ArrayList<>();
        for(int i=0; i< soretedlist.size()/2; i++){
            alterList.add(soretedlist.get(i));
            alterList.add(soretedlist.get(soretedlist.size()-1-i));
        }
        alterList.forEach(System.out::println);
    }
}

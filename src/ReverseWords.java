import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main (String[] args) {
        String myString = "abc def";
        List list = Arrays.asList(myString.split(""));
        Collections.reverse(list);
        System.out.println(String.join("", list));

    }

    public static void reverseWord (String[] args) {
        String myString = "abc def";
        String reverseMyString="";
        String[] myWords = myString.split(" ");
        for (String word:myWords){
            List list = Arrays.asList(word.split(""));
            Collections.reverse(list);
            reverseMyString = reverseMyString.concat(" ").concat(String.join("", list));
        }
        System.out.println(reverseMyString);

    }

}

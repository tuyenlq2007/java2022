public class PermutationsOfAString {
    public static void main (String[] args) {
        Permutation("ABC", 0, 3);
    }

    // Function for Permutation
    public static void Permutation(String s, int l, int r) {

        if (l==r){
            System.out.println(s);
        }
        for (int i=l; i<r; i++){
            String newString = swapString(s, l, i);
            Permutation(newString, l+1, r);
        }
    }

    // Function for swapping the characters
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

}

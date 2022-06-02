public class FindLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str ="strseeel";
        String test = "";

        // Result
        String max = "";


        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + String.valueOf(c);
            System.out.println(test);
            if (test.length() > max.length()) max = test;
        }
        System.out.println(max);
    }

    private static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }
}

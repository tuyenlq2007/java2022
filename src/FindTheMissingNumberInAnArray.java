interface Interface1 {
    static void print() {
        System.out.print("Hello");
    }
}

interface Interface2 {
    static void print() {
        System.out.print("World!");
    }
}

public class FindTheMissingNumberInAnArray {
    public static void main(String[] args) {

        int total=0;
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        int num_sum = 0;

        for (int i: numbers) {
            num_sum += i;
        }

        for (int i=0; i<= numbers.length+1;i++) {
            total += i;
        }

        System.out.print( total - num_sum );
        Interface1.print(); Interface2.print();
    }
}

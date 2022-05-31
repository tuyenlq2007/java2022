import java.lang.reflect.Array;

public class MoveAllZeroesToEndOfArray {
    public static void main (String[] args) {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        int count = 0;  // Count of non-zero elements
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        for (int i=count; i<n; i++) arr[i]=0;

        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }


}

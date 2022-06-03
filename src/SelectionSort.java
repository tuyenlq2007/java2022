import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public static void main (String[] args) {
        int[] myArry = new int[]{10,4,5,3,6,7};
        int n=myArry.length;
        for(int i=0;i<n;i++){
            int min=i,j=i,temp=myArry[i];
            while (j<n){
                if(myArry[j]<myArry[min]) min=j;
                j++;
            }
            myArry[i]=myArry[min];
            myArry[min]=temp;
        }
        for (int i : myArry) {
            System.out.println(i);
        }
    }


}

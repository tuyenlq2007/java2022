public class InsertionSort {
    public static void main (String[] args) {
        int[] myArry = new int[]{10,4,5,3,6,7};
        int n=myArry.length;
        for(int i=1;i<n;i++){
            int j=i-1,last=myArry[i];
            while ((j>=0)&&(last<myArry[j])){
                myArry[j+1]=myArry[j];
                j--;
            }
            myArry[j+1]=last;
        }
        for (int i : myArry) {
            System.out.println(i);
        }
    }


}

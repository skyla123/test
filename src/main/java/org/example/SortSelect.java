package org.example;

public class SortSelect implements Sortrategy{
    /**
     * @param array
     */
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i ;
            for (int j = i+1; j <n; j++) {
                if (array[j]<array[minIndex]) {
                    minIndex=j;
                }
            }
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }

    }
}

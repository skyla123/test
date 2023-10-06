package org.example;

public class SortInsert implements Sortrategy{
    /**
     * @param array
     */
    @Override
    public void sort(int[] array) {
        int i,j,insertNote;
        for (i = 1; i < array.length ; i++) {
            insertNote =array[i];
            j = i-1;
            while (j>=0 && insertNote <array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=insertNote;
        }
    }
}

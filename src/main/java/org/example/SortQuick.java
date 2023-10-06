package org.example;
public class SortQuick implements Sortrategy{
    /**
     * @param array
     */
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }
    public static void quickSort(int[]array,int left,int right){
        if (left>right) {
            return;
        }
        int base = array[left];
        int i = left;
        int j = right;
        while (i!=j){
            while (array[j]>=base && i<j){
                j--;
            }
            while (array[i]<=base &&i<j){
                i++;
            }
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        array[left]=array[i];
        array[i]=base;
        quickSort(array, left, i-1);
        quickSort(array, j+1, right);
    }
}


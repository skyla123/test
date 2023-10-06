package org.example;
//排序算法使用者
public class SortContext {
    private  Sortrategy sortrategy;
    public void  setSortrategy(Sortrategy sortrategy){
        this.sortrategy =sortrategy;
    }
    public void sort(int[]array){
        sortrategy.sort(array);
    }
}

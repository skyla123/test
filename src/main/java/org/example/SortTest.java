package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[]array = {5,4,7,9,1};
        SortContext context = new SortContext();

        //使用冒泡排序策略
        context.setSortrategy(new SortBubble());
        context.sort(array);
        System.out.println("冒泡排序结果："+ Arrays.toString(array));

        //使用选择排序策略
        context.setSortrategy(new SortSelect());
        context.sort(array);
        System.out.println("选择排序结果："+ Arrays.toString(array));

        //使用快速排序策略
        context.setSortrategy(new SortQuick());
        context.sort(array);
        System.out.println("快速排序结果："+ Arrays.toString(array));

        //使用插入排序策略
        context.setSortrategy(new SortInsert());
        context.sort(array);
        System.out.println("插入排序结果："+ Arrays.toString(array));

    }
}

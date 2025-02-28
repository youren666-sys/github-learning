package day1.ToolBox;

import java.util.Arrays;

public class MayiktArrays {
    /*
    将数组中的元素从大到小排序
     */

    private MayiktArrays() {

    }

    public static void sort(int[] arr){
        Arrays.sort(arr);//从小到大排序
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
   /*
    工具类设计思想
    */
}

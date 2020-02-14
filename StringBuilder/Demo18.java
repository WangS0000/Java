package StringBuilder;

import java.util.Arrays;

public class Demo18 {
    /**
     * public static String toString(int[] a)
     * public static void sort(int[] a)
     * public static int binarySearch(int[] a,int key)
     * @param args
     */
    public static void main(String[] args){
        int[] arr = {33,22,11,44,66,55};
        System.out.println(Arrays.toString(arr));       //数组转字符串
        Arrays.sort(arr);                               //排序（快排）
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {11,22,33,44,55,66};
        System.out.println(Arrays.binarySearch(arr2,22));
        System.out.println(Arrays.binarySearch(arr2,66));
        System.out.println(Arrays.binarySearch(arr2,88));
        System.out.println(Arrays.binarySearch(arr2,9));//-插入点-1
        System.out.println(Arrays.binarySearch(arr,56));
    }
}

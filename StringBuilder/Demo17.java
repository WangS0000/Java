package StringBuilder;

public class Demo17 {
    /**
     * 二分查找
     * A:案例演示
     *      数组高级二分查找代码
     * B:注意事项
     *      如果数组无序，就不能用二分查找
     *      因为如果你排序了，但是你排序的时候已经改变了我最原始的元素索引
     */
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55,66,77};
    }
    public static int getIndex(int[] arr,int value){
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;
        while(arr[mid]!=value){         //当中间值不是要找的那个值，就开始循环查找
            if(arr[mid]<value){         //当中间值小于了要找的值
                min = mid + 1;          //最小的索引改变
            }else if (arr[mid]>value){  //当中间值大于了要找的值
                max = mid - 1;          //最大的索引改变
            }
            mid = (min + max)/2;        //无论最大还是最小改变，中间索引都会随之改变
            if(min>max){                //如果最小索引大于了最大索引，就没有查找的可能性了
                return -1;              //返回-1
            }
        }
        return mid;
    }
}

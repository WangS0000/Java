package StringBuffer;

public class Demo8 {
    /**
     * 把数组中的数据按照指定格式拼接成字符串
     * 举例:
     *      int[] arr = {1,2,3};
     * 输出结果：
     *      “[1,2,3]”;
     * 用StringBuffer的功能实现
     * @param args
     */
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(ArrayToString(arr));
    }
    public static String ArrayToString(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

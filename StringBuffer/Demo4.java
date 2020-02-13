package StringBuffer;

public class Demo4 {
    /**
     * A:StringBuffer的删除功能
     *      public StringBuffer deleteCharAt(int index):
     *          删除指定位置的字符，并返回本身
     *      public StringBuffer delete(int start,int end):
     *          删除从指定位置开始指定位置结束的内容，并返回本身
     * @param args
     */
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("123456");
        sb.deleteCharAt(5);
        sb.delete(1,3);                 //左开右闭
        System.out.println(sb);
    }
}

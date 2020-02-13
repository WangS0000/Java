package StringBuffer;

public class Demo5 {
    /**
     * A:StringBuffer的替换功能
     *      public StringBuffer replace(int start,int end,String str):
     *          从start开始到end用str替换
     * B:StringBuffer的反转功能
     *      public StringBuffer reverse():
     *          字符串反转
     * @param args
     */
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("heima");
        sb.replace(0,3,"bai");          //替换
        System.out.println(sb);
        sb.reverse();                                  //反转
        System.out.println(sb);
    }
}

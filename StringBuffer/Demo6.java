package StringBuffer;

public class Demo6 {
    /**
     * A:StringBuffer的截取功能
     *      public String substring(int start):
     *          从指定位置截取到末尾
     *      public String substring(int start,int end):
     *          截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
     * @param args
     */
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("woaiheimama");
        //String str = sb.substring(4);
        //System.out.println(str);
        /**
         * 注意:返回值不是StringBuffer而是String本身*/
        String str3 = sb.substring(4,7);
        System.out.println(str3);
    }
}

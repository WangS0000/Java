package StringBuffer;

public class Demo7 {
    /**
     * A:String -- StringBuffer
     *      a:通过构造方法
     *      b:通过append()方法
     * B:StringBuffer -- String
     *      a:通过构造方法
     *      b:通过toString()方法
     *      c:通过substring(0,length);
     * @param args
     */
    public static void main(String[] args){
        //StringBuffer转String
        StringBuffer sb = new StringBuffer("heima");
        String s1 = new String(sb);//通过构造
        System.out.println(s1);
        String s2 = sb.toString();//通过toString()方法
        System.out.println(s2);
        String s3  = sb.substring(0,sb.length());//通过substring()方法截取字符串`转换为String
        System.out.println(s3);
    }
    public static void demo1(){
        //通过构造方法
        StringBuffer sb = new StringBuffer("heima");
        System.out.println(sb);
        //通过append方法追加
        StringBuffer sb2 = new StringBuffer();
        sb2.append("heima");
        System.out.println(sb2);
    }
}

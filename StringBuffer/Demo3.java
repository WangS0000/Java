package StringBuffer;

public class Demo3 {
    /**
     * A:StringBuffer的添加功能
     *      public StringBuffer append(String str):
     *        可以把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
     *      public StringBuffer insert(int offset,String str):
     *        在指定位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
     * @param args
     */
    public static void main(String[] args){
        //注意:不能越界索引，否则会出错
       StringBuffer sb = new StringBuffer("1234");
       sb.insert(3,"heima");
       System.out.println(sb);
    }
    public static void Demo1(){
        StringBuffer sb = new StringBuffer();
        //StringBuffer重写了toString方法，否则打印：类名+@+HashCode的16进制地址值
        StringBuffer sb2 = sb.append(true);
        StringBuffer sb3 = sb.append("heima");
        StringBuffer sb4 = sb.append(100);
        //StringBuffer是字符串缓冲区，当new的时候是在堆内存创建了一个对象，底层是一个长度为16的字符串数组
        //当调用添加的方法时，不会再重新创建对象，在不断向原缓冲区添加字符
        /**读取同一个缓冲区存取的同一个对象*/
        System.out.println(sb.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println(sb4.toString());
    }
    public static void Demo2(){
        //思想:
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        StringBuffer sb1 = sb.append(true);
        System.out.println(sb1);
        StringBuffer sb2 = sb.append("heima");
        System.out.println(sb2);
        StringBuffer sb3 = sb.append(100);
        System.out.println(sb3);
    }
}

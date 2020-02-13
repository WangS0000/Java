package Map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo10 {
    /**
     * HashMap和Hashtable的区别
     * 共同点：
     * 底层都是哈希算法，都是双列集合
     * 区别：
     * 1.HashMap是线程不安全的，效率高，JDK1.2版本
     *   Hashtable是线程安全的，效率低，JDK1.0版本的
     * 2.HashMap可以存储null键和null值
     *   Hashtable不可以存储null键和null值
     * @param args
     */
    public static void main(String[] args){
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        //hashtable.put(null,23);
        //hashtable.put("姜琦",null);
        System.out.println(hashtable);
    }
    public static void demo1(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put(null,23);
        hashMap.put(null,23);
        hashMap.put("李四",null);
        System.out.println(hashMap);
    }
}

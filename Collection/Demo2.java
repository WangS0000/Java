package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
    /**数组既可以存储基本数据类型，又可以存储引用数据类型，基本数据类型存储的是值，引用数据类型存储的是地址值*/
    /**集合只能存储引用数据类型（对象），集合中也可以存储基本数据类型，但是在存储的时候会自动装箱编程对象*/
    /** 数组的长度是不可变的，不能自动增长*/
    /** 集合的长度是可变的，可以根据元素的增加*/
    /**集合的原理：从开始大小一点点增长，每次比之前的大小增长1.5倍，最初相当于一个数组*/
    public static void main(String[] args){
        Collection<Object> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        System.out.println(c.size());
        c.remove("b");
        System.out.println(c.contains("b"));
        System.out.println(c);
        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());
    }
}

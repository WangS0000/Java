package Collection;

import java.util.*;

public class Demo10 {
    /**需求：有一个集合，请问：我想判断里面有没有“world”这个元素，如果有，就添加一个“javaee”元素*/
    public static void main(String[] args){
        List list = new ArrayList();//父类引用指向子类对象
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("world");
       /* Iterator it = list.iterator();
        while(it.hasNext()){
            String str = (String) it.next();
            if("world".equals(str)){
                list.add("javaee");
            }
        } */
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            String str = (String) lit.next();
            if("world".equals(str)){
                //list.add("javaee");
                lit.add("javaee");//使用list特有的迭代器可以直接将字符串添加到list中
            }
        }
        System.out.println(list);
    }
    public static void demo1(){
        Collection c = new ArrayList();
        c.add("hello");
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("world");
        if(c.contains("world")){
            c.add("javaee");
        }
        System.out.println(c);
    }
}

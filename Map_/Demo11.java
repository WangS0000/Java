package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo11 {
    public static void main(String[] args){
       ArrayList<String> list = new ArrayList<>();
       list.add("a");
       list.add("c");
       list.add("d");
       list.add("f");
       list.add("g");
       System.out.println(Collections.max(list));//获取最大值
       System.out.println(Collections.min(list));//获取最小值
        Collections.reverse(list);//使list反转
        System.out.println(list);
        Collections.shuffle(list);//随机置换，《可以用来洗牌》
        System.out.println(list);
    }
    public static void demo1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("d");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void demo2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("f");
        list.add("g");
        System.out.println(Collections.binarySearch(list,"c"));
        System.out.println(Collections.binarySearch(list,"b"));     //返回负的插入点减一
    }
}

package Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo8 {
    //List
    public static void main(String[] args){
        List list = new ArrayList();
        //List的add中索引可以等于个数但不能大于
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.add(4,"e");
        System.out.println(list);
        Object obj = list.remove(1);    //获取将被删除的元素
        System.out.println(obj);
        System.out.println(list);
        Object obj1 = list.get(1);
        System.out.println(obj1);
        list.set(1,"z");                      //对指定位置进行修改
        for (int i =0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

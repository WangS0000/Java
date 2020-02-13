package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    //哈希算法不能保证怎么存怎么取
    //Map中的键不能重复
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        Collection<Integer> c = map.values();//返回map中所有的Integer
        System.out.println(c);
        System.out.println(map.size());//打印键值对的个数
    }
    public static void demo1(){
        Map<String,Integer> map = new HashMap<>();
        Integer i1 = map.put("张三",23);//该返回值是被覆盖的部分，因为之前没有张三，23，所以，返回值为null
        Integer i2 = map.put("李四",24);
        Integer i3 = map.put("王五",25);
        Integer i4 = map.put("赵六",26);
        Integer i5 = map.put("张三",26);
        System.out.println(map);
        System.out.println(i5);//把被覆盖的值返回
    }
    public static void demo2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        Integer it = map.remove("张三");//根据键删除元素，返回值为对应的Integer
        System.out.println(it);
        System.out.println(map);
        System.out.println(map.containsKey("张三")+"..."+map.containsKey("李四"));//判断是否包含传入的键
        System.out.println(map.containsValue(23)+"..."+map.containsValue(24));//判断是否包含传入的值
    }
}

package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    /**Map集合是双列集合*/
    public static void main(String[] args){
        //使用增强for循环：foreach
       Map<String,Integer> map = new HashMap<>();
       map.put("张三",23);
       map.put("李四",24);
       map.put("王五",25);
       map.put("赵六",26);
       for(String str : map.keySet()){
           System.out.println(str+"="+map.get(str));
       }
    }
    public static void demo1(){
        //存取不一致
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            Integer integer = map.get(str);
            System.out.println(str+"="+integer);
        }
    }
}

package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        for (Map.Entry<String,Integer> en : map.entrySet()){        //Map.Entry是键值对对象
            System.out.println(en.getKey()+"="+en.getValue());
        }
    }
    public static void demo1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        //Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        //获取每一个对象
        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
        while(it.hasNext()){
            //获取每一个Entry对象
            Map.Entry<String,Integer> en = it.next();
            String key = en.getKey();                   //根据键值对对象获取键值
            Integer value = en.getValue();              //根据键值对对象获取值
            System.out.println(key+"="+value);
        }
    }
}
interface Inter{
    interface Inter2{
        public void show();
    }
}
class Demo implements Inter.Inter2{//继承接口中的内部接口
    @Override
    public void show(){

    }
}
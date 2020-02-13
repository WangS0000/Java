package Map;

import java.util.LinkedHashMap;

public class Demo6 {
    public static void main(String[] args){
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张三",23);
        linkedHashMap.put("李四",24);
        linkedHashMap.put("王五",25);
        linkedHashMap.put("赵六",26);
        System.out.println(linkedHashMap);
    }
}

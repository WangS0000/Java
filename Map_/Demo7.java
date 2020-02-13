package Map;

import java.util.TreeMap;

public class Demo7 {
    public static void main(String[] args){//年龄按从小到大排序输出，关键在于Student类中的compare方法
        TreeMap<Student,String> treeMap = new TreeMap<>();
        treeMap.put(new Student("张三",23),"北京");
        treeMap.put(new Student("李四",24),"上海");
        treeMap.put(new Student("王五",25),"广州");
        treeMap.put(new Student("Lucky",12),"陕西");
        treeMap.put(new Student("赵六",26),"深圳");
        System.out.println(treeMap);
    }
}

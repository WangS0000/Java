package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4 {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add(new Student("张三",23));
        collection.add(new Student("李四",24));
        collection.add(new Student("王五",25));
        Object[] arr = collection.toArray();
        for (int i = 0;i<arr.length;i++){
            Student s = (Student) arr[i];//向下转型
            System.out.println(s.getName());
        }
    }
    public static void demo1(){
        ///集合转数组
        Collection collection = new ArrayList();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);
        Object[] arr = collection.toArray();
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}

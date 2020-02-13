package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo6 {
    public static void main(String[] args){
        Collection c = new ArrayList();
        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        c.add(new Student("赵六",26));
        c.add(new Student("文文",21));
        Iterator it = c.iterator();
        while(it.hasNext()){
            Student s = (Student)it.next();
            System.out.println(s.getName());
        }
    }
    public static void deno1(){
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Iterator it = c.iterator();
        boolean b1 = it.hasNext();
        Object obj1 = it.next();
        Object obj2 = it.next();
        System.out.println(b1);
        System.out.println(obj1);
        System.out.println(obj2);
    }
    public static void demo2(){
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}

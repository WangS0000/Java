package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo11 {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("world");
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("-------------------------------");
        while(lit.hasPrevious()) {
            System.out.println(lit.previous());//只有ListIterator可以获取前一个
        }
    }
}

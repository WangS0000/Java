package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo5 {
    public static void main(String[] args){
        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        Collection collection2 = new ArrayList();
        collection2.add("d");
        collection2.add("e");
        collection2.add("f");
        collection1.addAll(collection2);
        System.out.println(collection1);
        //collection1.addAll(collection2);
        System.out.println(collection1);
    }
}

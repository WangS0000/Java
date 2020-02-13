package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Demo12 {
    public static void main(String[] args){
        //Vector
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");
        Enumeration enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement());
        }
    }
}

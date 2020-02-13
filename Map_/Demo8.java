package Map;

import java.util.HashMap;

public class Demo8 {
    /**
     * 统计字符串中每个字符出现的次数
     * 分析：
     * 1.定义一个需要被统计字符的字符串
     * 2.将字符串转换为字符数组
     * 3.定义双列集合，存储字符串中字符以及字符出现的次数
     * 4.遍历字符数组获取每一个字符，并将字符存储在双列集合中
     * 5.存储过程中要做判断，如果集合中不包含这个键，就将该字符当做键，值为1存储，如果集合中包含这个键，就将值加1存储
     * @param args
     */
    public static void main(String[] args){
        String s = "aaaaaabbbbbbbbbccccccccccccc";
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c : arr){
            /*if(!hashMap.containsKey(c)){
                hashMap.put(c,1);
            }else{
                hashMap.put(c,hashMap.get(c)+1);
            }*/
            hashMap.put(c,!hashMap.containsKey(c)? 1:hashMap.get(c)+1);
        }
        //System.out.println(hashMap);
        for(Character key : hashMap.keySet()){            //keySet()代表所有键的集合
            System.out.println(key+"="+hashMap.get(key));
        }
    }
}

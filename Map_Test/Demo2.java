package Map_Test;

import java.util.*;

public class Demo2 {
    public static void main(String[] args){
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"红桃","黑桃","方片","梅花"};
        HashMap<Integer,String> hashMap = new HashMap<>();  //存储索引和扑克牌
        ArrayList<Integer> list =new ArrayList<>();
        int index = 0;
        //拼接扑克牌索引，和扑克牌存储在hashMap中
        for(String s1:num){
            for(String s2 : color){
                hashMap.put(index,s2.concat(s1));
                list.add(index);        //将索引0~51添加到list集合中
                index++;
            }
        }
        //将小王添加到双列集合中
        hashMap.put(index,"小王");
        list.add(index);        //将52索引添加到list集合中
        index++;
        hashMap.put(index,"大王");
        list.add(index);        //将53索引添加到list集合中
        //System.out.println(hashMap);
        //洗牌
        Collections.shuffle(list);
        //System.out.println(list);
        //发牌
        TreeSet<Integer> gaojin = new TreeSet<>();
        TreeSet<Integer> longwu = new TreeSet<>();
        TreeSet<Integer> me = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for(int i=0;i<list.size();i++){
            if(i>=list.size()-3){
                dipai.add(list.get(i));
            }else if(i%3==0){
                gaojin.add(list.get(i));
            }else if(i%3==1){
                longwu.add(list.get(i));
            }else{
                me.add(list.get(i));
            }
        }
        //看牌
        lookPoker(hashMap,gaojin,"高进");
        lookPoker(hashMap,longwu,"龙五");
        lookPoker(hashMap,me,"我");
        lookPoker(hashMap,dipai,"底牌");
    }
    public static void lookPoker(HashMap<Integer,String> hashMap, TreeSet<Integer> treeSet,String name){
        System.out.println(name+"的牌是：");
        for(Integer i:treeSet){
            System.out.print(hashMap.get(i)+ " ");
        }
        System.out.println();
    }
}

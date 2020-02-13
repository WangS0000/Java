package Map_Test;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    /**
     * 模拟斗地主洗牌和发牌，牌没有顺序
     * @param args
     */
    public static void main(String[] args){
        //先定义一副扑克
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"红桃","黑桃","方片","梅花"};
        ArrayList<String> poker = new ArrayList<>();
        //拼接花色和数字
        for(String s1 : color){
            for(String s2 : num){
                poker.add(s1.concat(s2));//拼接函数
            }
        }
        poker.add("小王");
        poker.add("大王");
        //洗牌
        Collections.shuffle(poker);
        //发牌
        ArrayList<String> gaojin = new ArrayList<>();
        ArrayList<String> longwu = new ArrayList<>();
        ArrayList<String> degang = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for(int i=0;i<poker.size();i++){
            if(i>=poker.size()-3){
                dipai.add(poker.get(i));//将三张底牌存入底牌集合中
            }else if (i%3==0){
                gaojin.add(poker.get(i));
            }else if (i%3==1){
                longwu.add(poker.get(i));
            }else{
                degang.add(poker.get(i));
            }
        }
        //看牌
        System.out.println(gaojin);
        System.out.println(longwu);
        System.out.println(degang);
    }
}

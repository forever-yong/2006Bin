package cn.tedu.demo;

import java.util.ArrayList;


public class Demo14 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        score.add(98);
        score.add(77);
        score.add(66);
        score.add(89);
        score.add(79);
        score.add(50);
        score.add(100);

        System.out.println("删除前:"+score);

        for (int i = 0; i < score.size(); i++) {
            if(score.get(i)>80){
                score.remove(i);
                i--;
            }
        }
        System.out.println("删除后:"+score);

        String a = "ab";
        String b = "a"+"b";

        System.out.println(a==b);
    }


}

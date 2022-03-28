package cn.tedu.demo;

public class Demo04 {
    public static void main(String[] args) {
        for(int i=-200; i<0; i++){
            System.out.println(Integer.toBinaryString(i));
        }

        System.out.println("-----------------------------------------------");
        System.out.println(Integer.toBinaryString(-84));

        System.out.println( ~100+1 );

    }

}

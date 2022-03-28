package cn.tedu.demo;

public class Demo06 {
    public static void main(String[] args) {

        //n : 01110111 10011111 10110111 10110101
        int n = 0x779fb7b5;
        int m = 0xffffffff;
        int k = n&m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));

    }
}

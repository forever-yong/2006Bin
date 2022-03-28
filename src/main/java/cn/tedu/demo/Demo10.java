package cn.tedu.demo;

public class Demo10 {
    public static void main(String[] args) {
        int n = '好';
        int m = n>>>1;
        int k = n>>>2;
        int g = n>>>6;
        int b2 = ( g & 0x3f) | 0x80;

        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(g));
        System.out.println(Integer.toBinaryString(b2));
    }
}

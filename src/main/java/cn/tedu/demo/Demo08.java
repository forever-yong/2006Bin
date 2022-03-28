package cn.tedu.demo;

public class   Demo08 {
    public static void main(String[] args) {
        int n = 0x2d;
        int m = 0xc0;
        int k = n | m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
    }
}

package cn.tedu.demo;

public class Demo09 {
    public static void main(String[] args) {
        //将'好'的UTF-8最后一个字节编码,编出来
        int n ='好';
        int b3 = (n & 0x3f) | 0x80;
        System.out.println("'好'的编码: "+Integer.toBinaryString(n));
        System.out.println("六位掩码: "+Integer.toBinaryString(0x3f));
        System.out.println("截取好的后6位: "+Integer.toBinaryString(n & 0x3f));
        System.out.println("最后字节编码格式: "+Integer.toBinaryString(0x80));
        System.out.println("拼接以后的b3: "+Integer.toBinaryString(b3));
    }
}

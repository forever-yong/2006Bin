package cn.tedu.demo;

public class Demo07 {
    public static void main(String[] args) {
        int n = '人';
        System.out.println(Integer.toBinaryString(n));
        //将"好"字后六位   提取出来
        int a = n & 0x3f;
        System.out.println(Integer.toBinaryString(a));
    }
}

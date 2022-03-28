package cn.tedu.demo;

public class Demo02 {
    public static void main(String[] args) {
        /**
          * Java 1.7 提供了2进制直接量前缀 0b
          * 0b 是2进制前缀
          * 0x 是16进制前缀
          * long 类型直接量都需要添加后缀 L/l
          * 1. 2进制直接量是废物! 没有人用!
          * 2. 职业专家在写2进制时候,都采用16进制作为缩写
          */

        int n = 0b110010;
        System.out.println(n);

        long m = 0b1010_0101_0011_1010_0101_1111_0010_0111_0100_1110_1011_0011_1111_1100_1010_0010L;
        //

        long k = 0xa53a5f274eb3fca2L;
        System.out.println("m:"+m);
        System.out.println("k:"+k);

    }
}

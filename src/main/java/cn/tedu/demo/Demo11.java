package cn.tedu.demo;

public class Demo11 {
    public static void main(String[] args) throws Exception{
        int n = '好';
        int b3 = (n & 0x3f) | 0x80;
        int b2 = ((n>>>6) & 0x3f) | 0x80;
        int b1 = (n>>>12) | 0xe0;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toBinaryString(b2));
        System.out.println(Integer.toBinaryString(b3));
        //利用Java的UTF-8解码API验证编码结果
        byte[] bytes = {(byte)b1, (byte)b2, (byte)b3};
        String str  = new String(bytes,"UTF-8");
        System.out.println(str);
    }
}

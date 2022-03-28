package cn.tedu.demo;

public class Demo03 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int n = -1;

        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Integer.toBinaryString(min-1));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(max+1));

        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(Long.toBinaryString(lmax));
        System.out.println(Long.toBinaryString(lmin));
        System.out.println(Long.toBinaryString(-1));
        System.out.println(Long.toBinaryString(lmax+1));
    }
}

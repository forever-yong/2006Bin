package cn.tedu.demo;

import java.util.Arrays;

public class Demo13 {
    public static void main(String[] args) {
        int []a = {1,3,11,9,99,99,55,10,34,43,55,87} ;
        int C;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0;j<a.length-1-i;j++)
            {
                if (a[j]>a[j+1]){
                    C = a[j];
                    a[j] = a[j+1];
                    a[j+1] =C;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}

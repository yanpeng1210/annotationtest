package com.mtime;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入第一个字符串:");
        String str1 = s.nextLine();
        System.out.println("输入第二个字符串:");
        String str2 = s.nextLine();
        String str = str1+str2;
        System.out.println(str);
    }
}

package com.mtime;

/**
 * 1!+2!+...+10!的和
 */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 d3 = new Demo03();
        int sum = 0;
        for (int i = 1;i<=10;i++){
             sum  += d3.getFunc(i);
        }
        System.out.println("1!+2!+...+10!=" + sum);
    }
    public int getFunc(int n ){
        if(n ==1)
            return 1;
        else{
            return n*getFunc(n-1);
        }
    }
}

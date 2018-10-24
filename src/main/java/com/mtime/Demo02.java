package com.mtime;

/**
 * 语句判断某年份是否为闰年。
 */
public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo = new Demo02();
        demo.nian(1996);
    }
    public void nian(int year){
        if((year % 4 ==0 && year %100 !=0) ||(year %100 ==0)){
            System.out.println(year + "是闰年！");
        }else{
            System.out.println(year + "是平年！");
        }
    }
}

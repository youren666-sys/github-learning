package day1.System;

public class test1  {
    public static void main(String[] args) {
        System.out.println("正常执行代码");
        long start=System.currentTimeMillis();//获取当前系统时间
        System.out.println(start);
        for(int i=0;i<10000;i++){
            System.out.println("hello");
        }
        long end=System.currentTimeMillis();//获取当前执行完for循环时间
        System.out.println("花费时间"+(end-start)+"毫秒");
        System.exit(0);//正常停止java虚拟机
        System.out.println("结束执行代码");
    }
}

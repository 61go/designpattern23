package com.my.designpattern.singleton;
/**
 * @Author huruipeng
 * @Description //利用静态内部类(静态内部类的初始化是线程安全的）
 * @Date  2019/7/2 17:06
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Singleton2 {
    //一定要注意这里，必须声明私有的构造器，不然人家能直接new出来
    private Singleton2() {
    }
    private static class Singleton2Holder {
        private static final Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Singleton2Holder.instance;
    }

    //防止反序列化破坏单子
    private Object readResolve() {
        return Singleton2Holder.instance;
    }

   public  void test() {
       System.out.println();
       System.err.println(".......test");

   }
}

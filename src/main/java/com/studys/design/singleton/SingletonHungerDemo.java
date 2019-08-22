package com.studys.design.singleton;

/**
 * 描述:
 * 单例-饥饿模式(饿汉模式)线程安全
 *
 * @author cuichao
 * @create 2019-08-22 10:46
 */
public final class SingletonHungerDemo {


    private SingletonHungerDemo(){

    }


    public  static  SingletonHungerDemo getInstance(){

        return SingletonHolder.newIntance;
    }

    /*****
     * 方法一
     * 当有别的static方法被调用时，也会被new
     *
     * private static    SingletonHungerDemo newIntance = new SingletonHungerDemo(1);
     *
     *  public  static  SingletonHungerDemo getInstance(){
     *
     *      retun newIntance
     *  }
     *
     *
     *
     */

    /**
     * 通过内部类使只能通过getInstance获取实例对象
     * 方法二
     */
    private static class SingletonHolder{

        private static SingletonHungerDemo newIntance=new SingletonHungerDemo();
    }






}

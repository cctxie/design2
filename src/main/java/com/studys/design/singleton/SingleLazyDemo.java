package com.studys.design.singleton;

/**
 * 描述:
 * 单例-懒汉模式(不推荐，建议使用饿汉模式)
 *
 * @author cuichao
 * @create 2019-08-22 11:08
 */
public final class SingleLazyDemo {

    private static volatile  SingleLazyDemo newIntance;

    private SingleLazyDemo(){}

    public  static  SingleLazyDemo getNewInstance(){

        if(newIntance==null){

            synchronized(SingleLazyDemo.class){

                if(newIntance==null){
                    newIntance = new SingleLazyDemo();
                }

            }

        }
        return  newIntance;
    }

}




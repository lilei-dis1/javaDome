package com.test.day2.Array;


/**
 * 两种常见的初始化方式
 * 1.动态初始化(指定长度)
 * 2.静态初始化(指定内容)
 *
 * 动态初始化数组格式
 * 数据类型[] 数组名称 = new 数据类型[数组长度]
 *
 * 解析含义
 * 左侧数据类型，也就是数组中保存的数据，全都是统一的什么类型
 * 左侧的中括号，代表我是一个数组
 * 左侧的数组名称，给数组取一个名字
 * 右侧的new，代表创建数组的动作
 * 右侧的数据类型，必须和左侧的数据类型保持一致
 * 右侧中括号的长度，也就是数组中，到底可以保存多少个数据，是一个int数字
 */
public class Dome1 {
    public static void main(String[] args) {
        //创建一个数组。里面可以存放300个数据
        int[] arrayA = new int[300];

        double[] arrayB = new double[10];

        String[] arrayC = new String[10];

    }
}

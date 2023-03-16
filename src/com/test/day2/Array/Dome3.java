package com.test.day2.Array;


/**
 * 省略格式：
 * 数据类型[] 数组名称 = {元素1，元素2，。。。。};
 *
 * 注意事项：
 * 静态初始化，没有指定数组长度，但是仍然会推算出长度
 * 静态初始化标准格式可以拆分成两个步骤
 * 动态初始化也可以拆分成两个步骤
 * 静态初始化一但使用省略格式，就不能查分成两个步骤
 *
 * 使用建议
 * 如果不确定数组当中的数组内容。用动态初始化，否则，已经确定具体内容，用静态初始化
 */
public class Dome3 {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3};
    }
}

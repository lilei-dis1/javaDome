package cn.mxdx.test.fore;

/**
 * 一个标准的类通常满足下面四个组成部分
 * 1.所有的成员变量都要使用private关键字修饰
 * 2.没一个成员变量编写一对getter和setter方法
 * 3.编写一个无参数的构造方法
 * 4.编写一个全参数的构造方法
 *
 * 这样标准的类也叫做java baen
 */

public class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

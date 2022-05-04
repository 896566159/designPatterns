package com.xuemi.pattern.proxy.staticProxy;

/**
 * 参加研究生考试的学生
 */
public class Student implements GraduateEntranceExam{

    @Override
    public void exam() {
        System.out.println("我是考生，我要负责努力学习，参加考试");
    }
}

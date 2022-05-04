package com.xuemi.pattern.proxy.staticProxy;

public class Client {

    public static void main(String[] args) {

        //被代理类对象——学生
        GraduateEntranceExam student = new Student();

        //代理类对象——考试机构
        ExamOrganizationProxy proxy = new ExamOrganizationProxy(student);

        //代理对象中的该方法为 Student类对象 做了增强
        proxy.exam();
    }

}

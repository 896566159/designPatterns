package com.xuemi.pattern.proxy.dynamicProxy;

public class Client {

    public static void main(String[] args) {

        //被代理类对象——学生
        GraduateEntranceExam student = new Student();

        //代理类对象——考试机构
        GraduateEntranceExam proxy = (GraduateEntranceExam) new ExamOrganizationProxy(student).getProxyInstance();

        //代理对象调用增强后的方法
        proxy.exam();

        //class com.sun.proxy.$Proxy0:证明该代理对象类在内存中
        System.out.println(proxy.getClass());

    }

}

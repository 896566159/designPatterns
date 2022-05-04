package com.xuemi.pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 考研培训机构
 */
public class ExamOrganizationProxy {

    //考生对象
    GraduateEntranceExam student;

    //通过构造方法为考生对象赋值
    public ExamOrganizationProxy(GraduateEntranceExam student) {
        this.student = student;
    }

    public void teach() {
        System.out.println("机构老师负责给考生上课");
    }

    //为被代理类对象 生成一个代理类对象
    //为考生 创造一个 考研机构
    public Object getProxyInstance() {

        return Proxy.newProxyInstance(
                student.getClass().getClassLoader(),
                student.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("考试前");
                teach();
                Object invoke = method.invoke(student, args);
                System.out.println("考试后");
                congratulate();
                return invoke;
            }
        });

    }

    public void congratulate() {
        System.out.println("考生考上，为学生庆祝");
    }

}

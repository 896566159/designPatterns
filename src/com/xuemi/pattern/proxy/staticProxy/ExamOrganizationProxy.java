package com.xuemi.pattern.proxy.staticProxy;

/**
 * 考研培训机构
 */
public class ExamOrganizationProxy implements GraduateEntranceExam {

    //考生对象
    GraduateEntranceExam student;

    //通过构造方法为考生对象赋值
    public ExamOrganizationProxy(GraduateEntranceExam student) {
        this.student = student;
    }

    public void teach() {
        System.out.println("机构老师负责给考生上课");
    }

    //为考生考前、考后做其他服务
    @Override
    public void exam() {
        System.out.println("考试前");
        teach();
        student.exam();
        System.out.println("考试后");
        congratulate();
    }

    public void congratulate() {
        System.out.println("考生考上，为学生庆祝");
    }

}

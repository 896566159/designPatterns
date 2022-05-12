package com.xuemi.pattern.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        //采购需求
        PurchaseRequest purchaseRequest1 = new PurchaseRequest("采购电脑", 6000, 1);
        PurchaseRequest purchaseRequest2 = new PurchaseRequest("采购电脑", 800, 1);
        PurchaseRequest purchaseRequest3 = new PurchaseRequest("采购电脑", 2000, 1);

        Approver departmentApprover = new DepartmentApprover("系主任");
        Approver collegeApprover = new CollegeApprover("院长");
        Approver chairmanApprover = new ChairmanApprover("校长");
        departmentApprover.setApprover(collegeApprover);//系主任的一下个责任人是院长
        collegeApprover.setApprover(chairmanApprover);//院长的下一个责任人是校长

        //采购审批金额： 系主任 < 院长 < 校长
        departmentApprover.processRequse(purchaseRequest1);
        System.out.println("***************************");
        departmentApprover.processRequse(purchaseRequest2);
        System.out.println("***************************");
        departmentApprover.processRequse(purchaseRequest3);

    }

}

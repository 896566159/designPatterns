package com.xuemi.pattern.chainOfResponsibility;

public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequse(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() < 1000) {
            System.out.println("采购金额为" + purchaseRequest.getPrice() + "," + this.getName() + "已经处理该采购请求");
        } else {//金额过大，网下一个负责人抛
            System.out.println("金额过大," + this.getName() + "不能审批");
            this.approver.processRequse(purchaseRequest);
        }
    }
}

package com.xuemi.pattern.chainOfResponsibility;

public class ChairmanApprover extends Approver {
    public ChairmanApprover(String name) {
        super(name);
    }

    @Override
    public void processRequse(PurchaseRequest purchaseRequest) {
        System.out.println("采购金额为" + purchaseRequest.getPrice() + "," + this.getName() + "已经处理该采购请求");
    }
}

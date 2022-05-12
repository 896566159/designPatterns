package com.xuemi.pattern.chainOfResponsibility;

public abstract class Approver {

    //下一级处理者
    Approver approver;
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    //处理采购请求
    public abstract void processRequse(PurchaseRequest purchaseRequest);

    public void setName(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public Approver getApprover() {
        return approver;
    }

    public String getName() {
        return name;
    }
}

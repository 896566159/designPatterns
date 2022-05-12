package com.xuemi.pattern.chainOfResponsibility;

/**
 * 采购需求
 */
public class PurchaseRequest {

    //采购类型
    private String type;
    //采购金额
    private Integer price;
    private Integer id;

    public PurchaseRequest(String type, Integer price, Integer id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

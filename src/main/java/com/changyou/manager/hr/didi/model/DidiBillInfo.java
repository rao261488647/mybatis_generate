package com.changyou.manager.hr.didi.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "DIDI_BILL_INFO")
public class DidiBillInfo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "BILL_CODE")
    private String billCode;

    @Column(name = "MONTH")
    private String month;

    @Column(name = "ACTUAL_PRICE")
    private String actualPrice;

    @Column(name = "PAY_TIME")
    private String payTime;

    @Column(name = "MOBILE_NO")
    private String mobileNo;

    @Column(name = "FLAG")
    private String flag;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return BILL_CODE
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * @param billCode
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    /**
     * @return MONTH
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return ACTUAL_PRICE
     */
    public String getActualPrice() {
        return actualPrice;
    }

    /**
     * @param actualPrice
     */
    public void setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * @return PAY_TIME
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     * @return MOBILE_NO
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return FLAG
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
}
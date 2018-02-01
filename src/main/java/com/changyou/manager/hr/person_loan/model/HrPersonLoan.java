package com.changyou.manager.hr.person_loan.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_PERSON_LOAN")
public class HrPersonLoan {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "LOAN_MONEY")
    private BigDecimal loanMoney;

    @Column(name = "TIME_LIMIT")
    private String timeLimit;

    @Column(name = "PURPOSE")
    private String purpose;

    @Column(name = "LOAN_START")
    private Date loanStart;

    @Column(name = "LOAN_END")
    private Date loanEnd;

    @Column(name = "PREPAYMENT")
    private String prepayment;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

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
     * @return EMP_CODE
     */
    public String getEmpCode() {
        return empCode;
    }

    /**
     * @param empCode
     */
    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    /**
     * @return LOAN_MONEY
     */
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**
     * @param loanMoney
     */
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**
     * @return TIME_LIMIT
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * @param timeLimit
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * @return PURPOSE
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * @return LOAN_START
     */
    public Date getLoanStart() {
        return loanStart;
    }

    /**
     * @param loanStart
     */
    public void setLoanStart(Date loanStart) {
        this.loanStart = loanStart;
    }

    /**
     * @return LOAN_END
     */
    public Date getLoanEnd() {
        return loanEnd;
    }

    /**
     * @param loanEnd
     */
    public void setLoanEnd(Date loanEnd) {
        this.loanEnd = loanEnd;
    }

    /**
     * @return PREPAYMENT
     */
    public String getPrepayment() {
        return prepayment;
    }

    /**
     * @param prepayment
     */
    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * @return UPDATER_CODE
     */
    public String getUpdaterCode() {
        return updaterCode;
    }

    /**
     * @param updaterCode
     */
    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
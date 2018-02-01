package com.changyou.manager.hr.kpi.kpi_personal.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_PERSONAL")
public class KpiPersonal {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "CYCLE_ID")
    private BigDecimal cycleId;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "EMP_NO")
    private String empNo;

    @Column(name = "WORK_EMAIL")
    private String workEmail;

    @Column(name = "POST_NAME")
    private String postName;

    @Column(name = "WORTH")
    private String worth;

    @Column(name = "ACHIEVEMENT")
    private String achievement;

    @Column(name = "RESULT")
    private String result;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CONFIRM_NAME")
    private String confirmName;

    @Column(name = "CONFIRM_NO")
    private String confirmNo;

    @Column(name = "CONFIRM_TIME")
    private Date confirmTime;

    @Column(name = "INSERT_TIME")
    private Date insertTime;

    @Column(name = "INSERTER_CODE")
    private String inserterCode;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATER_CODE")
    private Date updaterCode;

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
     * @return CYCLE_ID
     */
    public BigDecimal getCycleId() {
        return cycleId;
    }

    /**
     * @param cycleId
     */
    public void setCycleId(BigDecimal cycleId) {
        this.cycleId = cycleId;
    }

    /**
     * @return EMP_NAME
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return EMP_NO
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * @return WORK_EMAIL
     */
    public String getWorkEmail() {
        return workEmail;
    }

    /**
     * @param workEmail
     */
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    /**
     * @return POST_NAME
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * @return WORTH
     */
    public String getWorth() {
        return worth;
    }

    /**
     * @param worth
     */
    public void setWorth(String worth) {
        this.worth = worth;
    }

    /**
     * @return ACHIEVEMENT
     */
    public String getAchievement() {
        return achievement;
    }

    /**
     * @param achievement
     */
    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    /**
     * @return RESULT
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return CONFIRM_NAME
     */
    public String getConfirmName() {
        return confirmName;
    }

    /**
     * @param confirmName
     */
    public void setConfirmName(String confirmName) {
        this.confirmName = confirmName;
    }

    /**
     * @return CONFIRM_NO
     */
    public String getConfirmNo() {
        return confirmNo;
    }

    /**
     * @param confirmNo
     */
    public void setConfirmNo(String confirmNo) {
        this.confirmNo = confirmNo;
    }

    /**
     * @return CONFIRM_TIME
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * @param confirmTime
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * @return INSERT_TIME
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * @param insertTime
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * @return INSERTER_CODE
     */
    public String getInserterCode() {
        return inserterCode;
    }

    /**
     * @param inserterCode
     */
    public void setInserterCode(String inserterCode) {
        this.inserterCode = inserterCode;
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

    /**
     * @return UPDATER_CODE
     */
    public Date getUpdaterCode() {
        return updaterCode;
    }

    /**
     * @param updaterCode
     */
    public void setUpdaterCode(Date updaterCode) {
        this.updaterCode = updaterCode;
    }
}
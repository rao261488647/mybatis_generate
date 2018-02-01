package com.changyou.manager.hr.tryout_regular.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HR_TRYOUT_REGULAR")
public class HrTryoutRegular {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "EMP_NO")
    private String empNo;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_TIME")
    private Object createTime;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    @Column(name = "UPDATE_TIME")
    private Object updateTime;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

    @Column(name = "TRYOUT_REGULAR_FLAG")
    private String tryoutRegularFlag;

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
     * @return DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * @return DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
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
     * @return CREATE_TIME
     */
    public Object getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    /**
     * @return CREATER_CODE
     */
    public String getCreaterCode() {
        return createrCode;
    }

    /**
     * @param createrCode
     */
    public void setCreaterCode(String createrCode) {
        this.createrCode = createrCode;
    }

    /**
     * @return UPDATE_TIME
     */
    public Object getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
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
     * @return TRYOUT_REGULAR_FLAG
     */
    public String getTryoutRegularFlag() {
        return tryoutRegularFlag;
    }

    /**
     * @param tryoutRegularFlag
     */
    public void setTryoutRegularFlag(String tryoutRegularFlag) {
        this.tryoutRegularFlag = tryoutRegularFlag;
    }
}
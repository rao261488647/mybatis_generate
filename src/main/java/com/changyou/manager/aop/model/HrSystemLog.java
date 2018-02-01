package com.changyou.manager.aop.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_SYSTEM_LOG")
public class HrSystemLog {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "METHOD_NAME")
    private String methodName;

    @Column(name = "METHOD_PARAMS")
    private String methodParams;

    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "EMP_NO")
    private String empNo;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "REMARK")
    private String remark;

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
     * @return METHOD_NAME
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * @param methodName
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * @return METHOD_PARAMS
     */
    public String getMethodParams() {
        return methodParams;
    }

    /**
     * @param methodParams
     */
    public void setMethodParams(String methodParams) {
        this.methodParams = methodParams;
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

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
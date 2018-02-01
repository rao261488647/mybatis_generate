package com.changyou.manager.hr.hc.plan_data.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HC_PLAN_DATA")
public class HcPlanData {
    @Id
    @Column(name = "PLAN_DATA_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal planDataId;

    @Column(name = "PLAN_ID")
    private BigDecimal planId;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_SHORT_NAME")
    private String deptShortName;

    @Column(name = "DEPT_FULL_NAME")
    private String deptFullName;

    @Column(name = "DEPT_FULL_CODE")
    private String deptFullCode;

    @Column(name = "DEPT_PARENT_CODE")
    private String deptParentCode;

    @Column(name = "DEPT_LEVEL")
    private BigDecimal deptLevel;

    @Column(name = "DEPT_LEAD_CODE")
    private String deptLeadCode;

    @Column(name = "DEPT_LEAD_NAME")
    private String deptLeadName;

    @Column(name = "DEPT_LEAD_POST_NO")
    private String deptLeadPostNo;

    @Column(name = "DEPT_LEAD_POST_NAME")
    private String deptLeadPostName;

    @Column(name = "DEPT_FINANCE_NO")
    private String deptFinanceNo;

    @Column(name = "HRBP")
    private String hrbp;

    @Column(name = "PM")
    private String pm;

    @Column(name = "ACCESS_MANAGER")
    private String accessManager;

    @Column(name = "DELETED")
    private BigDecimal deleted;

    @Column(name = "CY_HC")
    private BigDecimal cyHc;

    @Column(name = "SX_HC")
    private BigDecimal sxHc;

    @Column(name = "CP_HC")
    private BigDecimal cpHc;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    /**
     * @return PLAN_DATA_ID
     */
    public BigDecimal getPlanDataId() {
        return planDataId;
    }

    /**
     * @param planDataId
     */
    public void setPlanDataId(BigDecimal planDataId) {
        this.planDataId = planDataId;
    }

    /**
     * @return PLAN_ID
     */
    public BigDecimal getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(BigDecimal planId) {
        this.planId = planId;
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
     * @return DEPT_SHORT_NAME
     */
    public String getDeptShortName() {
        return deptShortName;
    }

    /**
     * @param deptShortName
     */
    public void setDeptShortName(String deptShortName) {
        this.deptShortName = deptShortName;
    }

    /**
     * @return DEPT_FULL_NAME
     */
    public String getDeptFullName() {
        return deptFullName;
    }

    /**
     * @param deptFullName
     */
    public void setDeptFullName(String deptFullName) {
        this.deptFullName = deptFullName;
    }

    /**
     * @return DEPT_FULL_CODE
     */
    public String getDeptFullCode() {
        return deptFullCode;
    }

    /**
     * @param deptFullCode
     */
    public void setDeptFullCode(String deptFullCode) {
        this.deptFullCode = deptFullCode;
    }

    /**
     * @return DEPT_PARENT_CODE
     */
    public String getDeptParentCode() {
        return deptParentCode;
    }

    /**
     * @param deptParentCode
     */
    public void setDeptParentCode(String deptParentCode) {
        this.deptParentCode = deptParentCode;
    }

    /**
     * @return DEPT_LEVEL
     */
    public BigDecimal getDeptLevel() {
        return deptLevel;
    }

    /**
     * @param deptLevel
     */
    public void setDeptLevel(BigDecimal deptLevel) {
        this.deptLevel = deptLevel;
    }

    /**
     * @return DEPT_LEAD_CODE
     */
    public String getDeptLeadCode() {
        return deptLeadCode;
    }

    /**
     * @param deptLeadCode
     */
    public void setDeptLeadCode(String deptLeadCode) {
        this.deptLeadCode = deptLeadCode;
    }

    /**
     * @return DEPT_LEAD_NAME
     */
    public String getDeptLeadName() {
        return deptLeadName;
    }

    /**
     * @param deptLeadName
     */
    public void setDeptLeadName(String deptLeadName) {
        this.deptLeadName = deptLeadName;
    }

    /**
     * @return DEPT_LEAD_POST_NO
     */
    public String getDeptLeadPostNo() {
        return deptLeadPostNo;
    }

    /**
     * @param deptLeadPostNo
     */
    public void setDeptLeadPostNo(String deptLeadPostNo) {
        this.deptLeadPostNo = deptLeadPostNo;
    }

    /**
     * @return DEPT_LEAD_POST_NAME
     */
    public String getDeptLeadPostName() {
        return deptLeadPostName;
    }

    /**
     * @param deptLeadPostName
     */
    public void setDeptLeadPostName(String deptLeadPostName) {
        this.deptLeadPostName = deptLeadPostName;
    }

    /**
     * @return DEPT_FINANCE_NO
     */
    public String getDeptFinanceNo() {
        return deptFinanceNo;
    }

    /**
     * @param deptFinanceNo
     */
    public void setDeptFinanceNo(String deptFinanceNo) {
        this.deptFinanceNo = deptFinanceNo;
    }

    /**
     * @return HRBP
     */
    public String getHrbp() {
        return hrbp;
    }

    /**
     * @param hrbp
     */
    public void setHrbp(String hrbp) {
        this.hrbp = hrbp;
    }

    /**
     * @return PM
     */
    public String getPm() {
        return pm;
    }

    /**
     * @param pm
     */
    public void setPm(String pm) {
        this.pm = pm;
    }

    /**
     * @return ACCESS_MANAGER
     */
    public String getAccessManager() {
        return accessManager;
    }

    /**
     * @param accessManager
     */
    public void setAccessManager(String accessManager) {
        this.accessManager = accessManager;
    }

    /**
     * @return DELETED
     */
    public BigDecimal getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(BigDecimal deleted) {
        this.deleted = deleted;
    }

    /**
     * @return CY_HC
     */
    public BigDecimal getCyHc() {
        return cyHc;
    }

    /**
     * @param cyHc
     */
    public void setCyHc(BigDecimal cyHc) {
        this.cyHc = cyHc;
    }

    /**
     * @return SX_HC
     */
    public BigDecimal getSxHc() {
        return sxHc;
    }

    /**
     * @param sxHc
     */
    public void setSxHc(BigDecimal sxHc) {
        this.sxHc = sxHc;
    }

    /**
     * @return CP_HC
     */
    public BigDecimal getCpHc() {
        return cpHc;
    }

    /**
     * @param cpHc
     */
    public void setCpHc(BigDecimal cpHc) {
        this.cpHc = cpHc;
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
}
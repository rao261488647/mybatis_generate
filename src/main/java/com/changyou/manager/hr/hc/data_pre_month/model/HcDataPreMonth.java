package com.changyou.manager.hr.hc.data_pre_month.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HC_DATA_PRE_MONTH")
public class HcDataPreMonth {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "MONTH")
    private String month;

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

    @Column(name = "CY_HC")
    private BigDecimal cyHc;

    @Column(name = "SX_HC")
    private BigDecimal sxHc;

    @Column(name = "CP_HC")
    private BigDecimal cpHc;

    @Column(name = "CY_SERVING_NO")
    private BigDecimal cyServingNo;

    @Column(name = "SX_SERVING_NO")
    private BigDecimal sxServingNo;

    @Column(name = "CP_SERVING_NO")
    private BigDecimal cpServingNo;

    @Column(name = "CY_RZ_NUM")
    private BigDecimal cyRzNum;

    @Column(name = "SX_RZ_NUM")
    private BigDecimal sxRzNum;

    @Column(name = "CP_RZ_NUM")
    private BigDecimal cpRzNum;

    @Column(name = "CY_ZDLZ_NUM")
    private BigDecimal cyZdlzNum;

    @Column(name = "SX_ZDLZ_NUM")
    private BigDecimal sxZdlzNum;

    @Column(name = "CP_ZDLZ_NUM")
    private BigDecimal cpZdlzNum;

    @Column(name = "CY_BDLZ_NUM")
    private BigDecimal cyBdlzNum;

    @Column(name = "SX_BDLZ_NUM")
    private BigDecimal sxBdlzNum;

    @Column(name = "CP_BDLZ_NUM")
    private BigDecimal cpBdlzNum;

    @Column(name = "CY_ZR_NUM")
    private BigDecimal cyZrNum;

    @Column(name = "SX_ZR_NUM")
    private BigDecimal sxZrNum;

    @Column(name = "CP_ZR_NUM")
    private BigDecimal cpZrNum;

    @Column(name = "CY_ZC_NUM")
    private BigDecimal cyZcNum;

    @Column(name = "SX_ZC_NUM")
    private BigDecimal sxZcNum;

    @Column(name = "CP_ZC_NUM")
    private BigDecimal cpZcNum;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

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
     * @return CY_SERVING_NO
     */
    public BigDecimal getCyServingNo() {
        return cyServingNo;
    }

    /**
     * @param cyServingNo
     */
    public void setCyServingNo(BigDecimal cyServingNo) {
        this.cyServingNo = cyServingNo;
    }

    /**
     * @return SX_SERVING_NO
     */
    public BigDecimal getSxServingNo() {
        return sxServingNo;
    }

    /**
     * @param sxServingNo
     */
    public void setSxServingNo(BigDecimal sxServingNo) {
        this.sxServingNo = sxServingNo;
    }

    /**
     * @return CP_SERVING_NO
     */
    public BigDecimal getCpServingNo() {
        return cpServingNo;
    }

    /**
     * @param cpServingNo
     */
    public void setCpServingNo(BigDecimal cpServingNo) {
        this.cpServingNo = cpServingNo;
    }

    /**
     * @return CY_RZ_NUM
     */
    public BigDecimal getCyRzNum() {
        return cyRzNum;
    }

    /**
     * @param cyRzNum
     */
    public void setCyRzNum(BigDecimal cyRzNum) {
        this.cyRzNum = cyRzNum;
    }

    /**
     * @return SX_RZ_NUM
     */
    public BigDecimal getSxRzNum() {
        return sxRzNum;
    }

    /**
     * @param sxRzNum
     */
    public void setSxRzNum(BigDecimal sxRzNum) {
        this.sxRzNum = sxRzNum;
    }

    /**
     * @return CP_RZ_NUM
     */
    public BigDecimal getCpRzNum() {
        return cpRzNum;
    }

    /**
     * @param cpRzNum
     */
    public void setCpRzNum(BigDecimal cpRzNum) {
        this.cpRzNum = cpRzNum;
    }

    /**
     * @return CY_ZDLZ_NUM
     */
    public BigDecimal getCyZdlzNum() {
        return cyZdlzNum;
    }

    /**
     * @param cyZdlzNum
     */
    public void setCyZdlzNum(BigDecimal cyZdlzNum) {
        this.cyZdlzNum = cyZdlzNum;
    }

    /**
     * @return SX_ZDLZ_NUM
     */
    public BigDecimal getSxZdlzNum() {
        return sxZdlzNum;
    }

    /**
     * @param sxZdlzNum
     */
    public void setSxZdlzNum(BigDecimal sxZdlzNum) {
        this.sxZdlzNum = sxZdlzNum;
    }

    /**
     * @return CP_ZDLZ_NUM
     */
    public BigDecimal getCpZdlzNum() {
        return cpZdlzNum;
    }

    /**
     * @param cpZdlzNum
     */
    public void setCpZdlzNum(BigDecimal cpZdlzNum) {
        this.cpZdlzNum = cpZdlzNum;
    }

    /**
     * @return CY_BDLZ_NUM
     */
    public BigDecimal getCyBdlzNum() {
        return cyBdlzNum;
    }

    /**
     * @param cyBdlzNum
     */
    public void setCyBdlzNum(BigDecimal cyBdlzNum) {
        this.cyBdlzNum = cyBdlzNum;
    }

    /**
     * @return SX_BDLZ_NUM
     */
    public BigDecimal getSxBdlzNum() {
        return sxBdlzNum;
    }

    /**
     * @param sxBdlzNum
     */
    public void setSxBdlzNum(BigDecimal sxBdlzNum) {
        this.sxBdlzNum = sxBdlzNum;
    }

    /**
     * @return CP_BDLZ_NUM
     */
    public BigDecimal getCpBdlzNum() {
        return cpBdlzNum;
    }

    /**
     * @param cpBdlzNum
     */
    public void setCpBdlzNum(BigDecimal cpBdlzNum) {
        this.cpBdlzNum = cpBdlzNum;
    }

    /**
     * @return CY_ZR_NUM
     */
    public BigDecimal getCyZrNum() {
        return cyZrNum;
    }

    /**
     * @param cyZrNum
     */
    public void setCyZrNum(BigDecimal cyZrNum) {
        this.cyZrNum = cyZrNum;
    }

    /**
     * @return SX_ZR_NUM
     */
    public BigDecimal getSxZrNum() {
        return sxZrNum;
    }

    /**
     * @param sxZrNum
     */
    public void setSxZrNum(BigDecimal sxZrNum) {
        this.sxZrNum = sxZrNum;
    }

    /**
     * @return CP_ZR_NUM
     */
    public BigDecimal getCpZrNum() {
        return cpZrNum;
    }

    /**
     * @param cpZrNum
     */
    public void setCpZrNum(BigDecimal cpZrNum) {
        this.cpZrNum = cpZrNum;
    }

    /**
     * @return CY_ZC_NUM
     */
    public BigDecimal getCyZcNum() {
        return cyZcNum;
    }

    /**
     * @param cyZcNum
     */
    public void setCyZcNum(BigDecimal cyZcNum) {
        this.cyZcNum = cyZcNum;
    }

    /**
     * @return SX_ZC_NUM
     */
    public BigDecimal getSxZcNum() {
        return sxZcNum;
    }

    /**
     * @param sxZcNum
     */
    public void setSxZcNum(BigDecimal sxZcNum) {
        this.sxZcNum = sxZcNum;
    }

    /**
     * @return CP_ZC_NUM
     */
    public BigDecimal getCpZcNum() {
        return cpZcNum;
    }

    /**
     * @param cpZcNum
     */
    public void setCpZcNum(BigDecimal cpZcNum) {
        this.cpZcNum = cpZcNum;
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
}
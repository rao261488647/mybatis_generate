package com.changyou.manager.hr.hc.plan.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HC_PLAN")
public class HcPlan {
    @Id
    @Column(name = "PLAN_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal planId;

    @Column(name = "YEAE")
    private BigDecimal yeae;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    @Column(name = "CREATER_TIME")
    private Date createrTime;

    @Column(name = "STATE")
    private String state;

    @Column(name = "LAST_UPDATER")
    private Date lastUpdater;

    @Column(name = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @Column(name = "REMARK")
    private String remark;

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
     * @return YEAE
     */
    public BigDecimal getYeae() {
        return yeae;
    }

    /**
     * @param yeae
     */
    public void setYeae(BigDecimal yeae) {
        this.yeae = yeae;
    }

    /**
     * @return VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
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
     * @return CREATER_TIME
     */
    public Date getCreaterTime() {
        return createrTime;
    }

    /**
     * @param createrTime
     */
    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return LAST_UPDATER
     */
    public Date getLastUpdater() {
        return lastUpdater;
    }

    /**
     * @param lastUpdater
     */
    public void setLastUpdater(Date lastUpdater) {
        this.lastUpdater = lastUpdater;
    }

    /**
     * @return LAST_UPDATE_TIME
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
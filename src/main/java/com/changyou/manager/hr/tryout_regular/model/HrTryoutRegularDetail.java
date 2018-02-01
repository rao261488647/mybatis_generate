package com.changyou.manager.hr.tryout_regular.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HR_TRYOUT_REGULAR_DETAIL")
public class HrTryoutRegularDetail {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "TRYOUT_REGULAR_ID")
    private BigDecimal tryoutRegularId;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "TARGET")
    private String target;

    @Column(name = "STANDARD")
    private String standard;

    @Column(name = "WEIGHT")
    private BigDecimal weight;

    @Column(name = "CREATE_TIME")
    private Object createTime;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    @Column(name = "UPDATE_TIME")
    private Object updateTime;

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
     * @return TRYOUT_REGULAR_ID
     */
    public BigDecimal getTryoutRegularId() {
        return tryoutRegularId;
    }

    /**
     * @param tryoutRegularId
     */
    public void setTryoutRegularId(BigDecimal tryoutRegularId) {
        this.tryoutRegularId = tryoutRegularId;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return TARGET
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @return STANDARD
     */
    public String getStandard() {
        return standard;
    }

    /**
     * @param standard
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * @return WEIGHT
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
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
}
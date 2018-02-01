package com.changyou.manager.hr.pro_config_bp.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_PRO_CONFIG_BP")
public class HrProConfigBp {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "BP_CODE")
    private String bpCode;

    @Column(name = "PRO_CODE")
    private String proCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CREATER_CODE")
    private String createrCode;

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
     * @return BP_CODE
     */
    public String getBpCode() {
        return bpCode;
    }

    /**
     * @param bpCode
     */
    public void setBpCode(String bpCode) {
        this.bpCode = bpCode;
    }

    /**
     * @return PRO_CODE
     */
    public String getProCode() {
        return proCode;
    }

    /**
     * @param proCode
     */
    public void setProCode(String proCode) {
        this.proCode = proCode;
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
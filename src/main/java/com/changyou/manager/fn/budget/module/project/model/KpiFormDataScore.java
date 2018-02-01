package com.changyou.manager.fn.budget.module.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_FORM_DATA_SCORE")
public class KpiFormDataScore {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "FORM_DATA_ID")
    private BigDecimal formDataId;

    @Column(name = "SELF_SCORE")
    private String selfScore;

    @Column(name = "SELF_DESCRIBE")
    private String selfDescribe;

    @Column(name = "SELF_NAME")
    private String selfName;

    @Column(name = "OFFICER_SCORE")
    private String officerScore;

    @Column(name = "CEO_SCORE")
    private String ceoScore;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "HRBP_NAME")
    private String hrbpName;

    @Column(name = "HRBP_CODE")
    private String hrbpCode;

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
     * @return FORM_DATA_ID
     */
    public BigDecimal getFormDataId() {
        return formDataId;
    }

    /**
     * @param formDataId
     */
    public void setFormDataId(BigDecimal formDataId) {
        this.formDataId = formDataId;
    }

    /**
     * @return SELF_SCORE
     */
    public String getSelfScore() {
        return selfScore;
    }

    /**
     * @param selfScore
     */
    public void setSelfScore(String selfScore) {
        this.selfScore = selfScore;
    }

    /**
     * @return SELF_DESCRIBE
     */
    public String getSelfDescribe() {
        return selfDescribe;
    }

    /**
     * @param selfDescribe
     */
    public void setSelfDescribe(String selfDescribe) {
        this.selfDescribe = selfDescribe;
    }

    /**
     * @return SELF_NAME
     */
    public String getSelfName() {
        return selfName;
    }

    /**
     * @param selfName
     */
    public void setSelfName(String selfName) {
        this.selfName = selfName;
    }

    /**
     * @return OFFICER_SCORE
     */
    public String getOfficerScore() {
        return officerScore;
    }

    /**
     * @param officerScore
     */
    public void setOfficerScore(String officerScore) {
        this.officerScore = officerScore;
    }

    /**
     * @return CEO_SCORE
     */
    public String getCeoScore() {
        return ceoScore;
    }

    /**
     * @param ceoScore
     */
    public void setCeoScore(String ceoScore) {
        this.ceoScore = ceoScore;
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
     * @return HRBP_NAME
     */
    public String getHrbpName() {
        return hrbpName;
    }

    /**
     * @param hrbpName
     */
    public void setHrbpName(String hrbpName) {
        this.hrbpName = hrbpName;
    }

    /**
     * @return HRBP_CODE
     */
    public String getHrbpCode() {
        return hrbpCode;
    }

    /**
     * @param hrbpCode
     */
    public void setHrbpCode(String hrbpCode) {
        this.hrbpCode = hrbpCode;
    }
}
package com.changyou.manager.fn.budget.module.project.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "KPI_ASSESS_SCORE")
public class KpiAssessScore {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "ASSESS_ID")
    private BigDecimal assessId;

    @Column(name = "ASSESS_OA_ID")
    private BigDecimal assessOaId;

    @Column(name = "FINAL_SCORE")
    private String finalScore;

    @Column(name = "ASSESS_LEVEL")
    private String assessLevel;

    @Column(name = "VALUES_LEVEL")
    private String valuesLevel;

    @Column(name = "VALUES_DESCRIBE")
    private String valuesDescribe;

    @Column(name = "OFFICER_DECRIBE")
    private String officerDecribe;

    @Column(name = "OFFICER_SCORE")
    private String officerScore;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "HRBP_CODE")
    private String hrbpCode;

    @Column(name = "HRBP_NAME")
    private String hrbpName;

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
     * @return ASSESS_ID
     */
    public BigDecimal getAssessId() {
        return assessId;
    }

    /**
     * @param assessId
     */
    public void setAssessId(BigDecimal assessId) {
        this.assessId = assessId;
    }

    /**
     * @return ASSESS_OA_ID
     */
    public BigDecimal getAssessOaId() {
        return assessOaId;
    }

    /**
     * @param assessOaId
     */
    public void setAssessOaId(BigDecimal assessOaId) {
        this.assessOaId = assessOaId;
    }

    /**
     * @return FINAL_SCORE
     */
    public String getFinalScore() {
        return finalScore;
    }

    /**
     * @param finalScore
     */
    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    /**
     * @return ASSESS_LEVEL
     */
    public String getAssessLevel() {
        return assessLevel;
    }

    /**
     * @param assessLevel
     */
    public void setAssessLevel(String assessLevel) {
        this.assessLevel = assessLevel;
    }

    /**
     * @return VALUES_LEVEL
     */
    public String getValuesLevel() {
        return valuesLevel;
    }

    /**
     * @param valuesLevel
     */
    public void setValuesLevel(String valuesLevel) {
        this.valuesLevel = valuesLevel;
    }

    /**
     * @return VALUES_DESCRIBE
     */
    public String getValuesDescribe() {
        return valuesDescribe;
    }

    /**
     * @param valuesDescribe
     */
    public void setValuesDescribe(String valuesDescribe) {
        this.valuesDescribe = valuesDescribe;
    }

    /**
     * @return OFFICER_DECRIBE
     */
    public String getOfficerDecribe() {
        return officerDecribe;
    }

    /**
     * @param officerDecribe
     */
    public void setOfficerDecribe(String officerDecribe) {
        this.officerDecribe = officerDecribe;
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
}
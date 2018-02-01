package com.changyou.manager.hr.kpi.form_data.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "KPI_FORM_DATA")
public class KpiFormData {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "ASSESS_OA_ID")
    private String assessOaId;

    @Column(name = "INDICATOR_ITEM")
    private String indicatorItem;

    @Column(name = "INDICATOR_DEFINITION")
    private String indicatorDefinition;

    @Column(name = "HISTORICAL_DATA")
    private String historicalData;

    @Column(name = "STANDARD")
    private String standard;

    @Column(name = "CHALLENGE")
    private String challenge;

    @Column(name = "WEIGHTS")
    private BigDecimal weights;

    @Column(name = "NEW_SOURCE")
    private String newSource;

    @Column(name = "UPDATE_REASON")
    private String updateReason;

    @Column(name = "IS_UPDATE")
    private String isUpdate;

    @Column(name = "DATA_BELONG")
    private String dataBelong;

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
     * @return ASSESS_OA_ID
     */
    public String getAssessOaId() {
        return assessOaId;
    }

    /**
     * @param assessOaId
     */
    public void setAssessOaId(String assessOaId) {
        this.assessOaId = assessOaId;
    }

    /**
     * @return INDICATOR_ITEM
     */
    public String getIndicatorItem() {
        return indicatorItem;
    }

    /**
     * @param indicatorItem
     */
    public void setIndicatorItem(String indicatorItem) {
        this.indicatorItem = indicatorItem;
    }

    /**
     * @return INDICATOR_DEFINITION
     */
    public String getIndicatorDefinition() {
        return indicatorDefinition;
    }

    /**
     * @param indicatorDefinition
     */
    public void setIndicatorDefinition(String indicatorDefinition) {
        this.indicatorDefinition = indicatorDefinition;
    }

    /**
     * @return HISTORICAL_DATA
     */
    public String getHistoricalData() {
        return historicalData;
    }

    /**
     * @param historicalData
     */
    public void setHistoricalData(String historicalData) {
        this.historicalData = historicalData;
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
     * @return CHALLENGE
     */
    public String getChallenge() {
        return challenge;
    }

    /**
     * @param challenge
     */
    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    /**
     * @return WEIGHTS
     */
    public BigDecimal getWeights() {
        return weights;
    }

    /**
     * @param weights
     */
    public void setWeights(BigDecimal weights) {
        this.weights = weights;
    }

    /**
     * @return NEW_SOURCE
     */
    public String getNewSource() {
        return newSource;
    }

    /**
     * @param newSource
     */
    public void setNewSource(String newSource) {
        this.newSource = newSource;
    }

    /**
     * @return UPDATE_REASON
     */
    public String getUpdateReason() {
        return updateReason;
    }

    /**
     * @param updateReason
     */
    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    /**
     * @return IS_UPDATE
     */
    public String getIsUpdate() {
        return isUpdate;
    }

    /**
     * @param isUpdate
     */
    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }

    /**
     * @return DATA_BELONG
     */
    public String getDataBelong() {
        return dataBelong;
    }

    /**
     * @param dataBelong
     */
    public void setDataBelong(String dataBelong) {
        this.dataBelong = dataBelong;
    }
}
package com.changyou.manager.hr.kpi.assess_oa.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "KPI_ASSESS_OA")
public class KpiAssessOa {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "ASSESS_ID")
    private BigDecimal assessId;

    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "FORM_TYPE")
    private String formType;

    @Column(name = "FORM_STATUS")
    private String formStatus;

    @Column(name = "OPINION")
    private String opinion;

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
     * @return REQUEST_ID
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return FORM_TYPE
     */
    public String getFormType() {
        return formType;
    }

    /**
     * @param formType
     */
    public void setFormType(String formType) {
        this.formType = formType;
    }

    /**
     * @return FORM_STATUS
     */
    public String getFormStatus() {
        return formStatus;
    }

    /**
     * @param formStatus
     */
    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    /**
     * @return OPINION
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * @param opinion
     */
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
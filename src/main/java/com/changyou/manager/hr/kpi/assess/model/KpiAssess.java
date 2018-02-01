package com.changyou.manager.hr.kpi.assess.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_ASSESS")
public class KpiAssess {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "CYCLE_ID")
    private BigDecimal cycleId;

    @Column(name = "ASSESS_TYPE")
    private String assessType;

    @Column(name = "ASSESS_DEPT_CODE")
    private String assessDeptCode;

    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "STATUS")
    private BigDecimal status;

    @Column(name = "BELONG_DEPT_CODE")
    private String belongDeptCode;

    @Column(name = "LAST_WARN_TIME")
    private Date lastWarnTime;

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
     * @return CYCLE_ID
     */
    public BigDecimal getCycleId() {
        return cycleId;
    }

    /**
     * @param cycleId
     */
    public void setCycleId(BigDecimal cycleId) {
        this.cycleId = cycleId;
    }

    /**
     * @return ASSESS_TYPE
     */
    public String getAssessType() {
        return assessType;
    }

    /**
     * @param assessType
     */
    public void setAssessType(String assessType) {
        this.assessType = assessType;
    }

    /**
     * @return ASSESS_DEPT_CODE
     */
    public String getAssessDeptCode() {
        return assessDeptCode;
    }

    /**
     * @param assessDeptCode
     */
    public void setAssessDeptCode(String assessDeptCode) {
        this.assessDeptCode = assessDeptCode;
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
     * @return STATUS
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * @return BELONG_DEPT_CODE
     */
    public String getBelongDeptCode() {
        return belongDeptCode;
    }

    /**
     * @param belongDeptCode
     */
    public void setBelongDeptCode(String belongDeptCode) {
        this.belongDeptCode = belongDeptCode;
    }

    /**
     * @return LAST_WARN_TIME
     */
    public Date getLastWarnTime() {
        return lastWarnTime;
    }

    /**
     * @param lastWarnTime
     */
    public void setLastWarnTime(Date lastWarnTime) {
        this.lastWarnTime = lastWarnTime;
    }
}
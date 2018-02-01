package com.changyou.manager.hr.kpi.version_record.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_VERSION_RECORD")
public class KpiVersionRecord {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "ASSESS_OA_ID")
    private BigDecimal assessOaId;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

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
}
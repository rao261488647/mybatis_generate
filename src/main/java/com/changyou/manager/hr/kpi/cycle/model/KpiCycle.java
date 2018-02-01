package com.changyou.manager.hr.kpi.cycle.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_CYCLE")
public class KpiCycle {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "YEAR")
    private BigDecimal year;

    @Column(name = "STAGE")
    private String stage;

    @Column(name = "CREATER_CODE")
    private String createrCode;

    @Column(name = "CREATER_TIME")
    private Date createrTime;

    @Column(name = "STATUS")
    private String status;

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
     * @return YEAR
     */
    public BigDecimal getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(BigDecimal year) {
        this.year = year;
    }

    /**
     * @return STAGE
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage
     */
    public void setStage(String stage) {
        this.stage = stage;
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
}
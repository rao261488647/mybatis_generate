package com.changyou.manager.hr.hc.plan_file.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HC_PLAN_FILE")
public class HcPlanFile {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "PLAN_ID")
    private BigDecimal planId;

    @Column(name = "FILE_ID")
    private String fileId;

    @Column(name = "FILE_NAME")
    private String fileName;

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
     * @return FILE_ID
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return FILE_NAME
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
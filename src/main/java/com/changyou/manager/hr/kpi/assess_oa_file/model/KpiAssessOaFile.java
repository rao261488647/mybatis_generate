package com.changyou.manager.hr.kpi.assess_oa_file.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_ASSESS_OA_FILE")
public class KpiAssessOaFile {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "ASSESS_OA_ID")
    private BigDecimal assessOaId;

    @Column(name = "FILE_ID")
    private String fileId;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "UPLOAD_TIME")
    private Date uploadTime;

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

    /**
     * @return UPLOAD_TIME
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * @param uploadTime
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}
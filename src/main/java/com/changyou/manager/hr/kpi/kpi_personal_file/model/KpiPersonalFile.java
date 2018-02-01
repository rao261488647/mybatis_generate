package com.changyou.manager.hr.kpi.kpi_personal_file.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "KPI_PERSONAL_FILE")
public class KpiPersonalFile {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "PERSONAL_ID")
    private BigDecimal personalId;

    @Column(name = "FILE_ID")
    private String fileId;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "INSERT_TIME")
    private Date insertTime;

    @Column(name = "INSERTER_CODE")
    private String inserterCode;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

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
     * @return PERSONAL_ID
     */
    public BigDecimal getPersonalId() {
        return personalId;
    }

    /**
     * @param personalId
     */
    public void setPersonalId(BigDecimal personalId) {
        this.personalId = personalId;
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
     * @return INSERT_TIME
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * @param insertTime
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * @return INSERTER_CODE
     */
    public String getInserterCode() {
        return inserterCode;
    }

    /**
     * @param inserterCode
     */
    public void setInserterCode(String inserterCode) {
        this.inserterCode = inserterCode;
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
     * @return UPDATER_CODE
     */
    public String getUpdaterCode() {
        return updaterCode;
    }

    /**
     * @param updaterCode
     */
    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }
}
package com.changyou.manager.hr.source_month.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_SOURCE_MONTH")
public class HrSourceMonth {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "FILE_ID")
    private String fileId;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "PARENT_ID")
    private BigDecimal parentId;

    @Column(name = "UPLOADER_CODE")
    private String uploaderCode;

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
     * @return PARENT_ID
     */
    public BigDecimal getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    /**
     * @return UPLOADER_CODE
     */
    public String getUploaderCode() {
        return uploaderCode;
    }

    /**
     * @param uploaderCode
     */
    public void setUploaderCode(String uploaderCode) {
        this.uploaderCode = uploaderCode;
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